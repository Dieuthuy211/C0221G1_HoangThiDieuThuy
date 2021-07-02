package com.example.controller;

import com.example.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/user")
    public String showHome(Model model){
        model.addAttribute("user",new User());
        return "login";
    }
}
