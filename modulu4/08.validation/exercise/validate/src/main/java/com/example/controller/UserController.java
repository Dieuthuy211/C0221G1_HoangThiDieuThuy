package com.example.controller;

import com.example.dto.UserDto;
import com.example.model.entity.User;
import com.example.model.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping("/users")
    public ModelAndView listCategory(@PageableDefault(value = 2) Pageable pageable) {
        Page<User> users = userService.findAll(pageable);

        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("userDto",new UserDto());
        return "/create";
    }
    @PostMapping("/create")
    public String createUser(@Validated  @ModelAttribute UserDto userDto, BindingResult bindingResult, RedirectAttributes redirect){
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        if(bindingResult.hasFieldErrors()) {
            return "/create";
        }else{
                this.userService.save(user);
                redirect.addFlashAttribute("message", "Create User Successfull !");
                return "redirect:/users";
            }
        }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        User user = userService.findById(id);

        if (user != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("user", user);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView update(@ModelAttribute("user") User user) {
        userService.save(user);

        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("user", user);
        modelAndView.addObject("message", "blog updated successfully");
        return modelAndView;
    }


    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        User user = userService.findById(id);
        if (user != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("user", user);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("user") User province) {
        userService.remove(province.getId());
        return "redirect:/users";
    }
}
