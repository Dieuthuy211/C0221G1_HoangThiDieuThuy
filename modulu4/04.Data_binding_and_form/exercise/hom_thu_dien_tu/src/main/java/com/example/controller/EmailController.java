package com.example.controller;

import com.example.model.bean.Email;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class EmailController {
    @GetMapping("/")
    public String showCreate(Model model){
//        String[] languageArray={"English","Vietnamese","Japanese","Chinese"};
        Integer[] sizeArray={5,10,15,25,50,100};
        model.addAttribute("email",new Email());
//        model.addAttribute("languageArray",languageArray);
        model.addAttribute("languageArray",new String[]{"English","Vietnamese","Japanese","Chinese"});
        model.addAttribute("sizeArray",sizeArray);
      return "create";
    }
    @PostMapping("/email")
    public String ShowInfo(@ModelAttribute("email") Email email,Model model){
        model.addAttribute("email",email);
        return "info";
    }
}
