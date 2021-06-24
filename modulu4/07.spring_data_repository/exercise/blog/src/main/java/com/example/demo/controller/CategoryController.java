package com.example.demo.controller;


import com.example.demo.model.entity.Category;
import com.example.demo.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequestMapping(value = {"/categories","/"})
@Controller
public class CategoryController {

    @Autowired
    ICategoryService categoryService;

    @GetMapping("/categories")
    public ModelAndView listCategory(@PageableDefault(value = 2) Pageable pageable) {
        Page<Category> categories = categoryService.findAll(pageable);

        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @GetMapping("/categories/create")
    public ModelAndView showCreateForm() {

        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/categories/create")
    public ModelAndView save(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/create");

        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }

    @GetMapping("/categories/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Category category = categoryService.findById(id);

        if (category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category", category);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/categories/edit")
    public ModelAndView update(@ModelAttribute("category") Category category) {
        categoryService.save(category);

        ModelAndView modelAndView = new ModelAndView("/category/edit");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "blog updated successfully");
        return modelAndView;
    }

    @GetMapping("/categories/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Category category = categoryService.findById(id);
        if (category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/delete");
            modelAndView.addObject("category", category);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/categories/delete")
    public String delete(@ModelAttribute("category") Category category) {
        categoryService.remove(category.getId());
        return "redirect:/categories";
    }
}
