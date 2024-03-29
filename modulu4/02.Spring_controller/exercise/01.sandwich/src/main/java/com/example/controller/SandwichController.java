package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SandwichController {
    @RequestMapping("/")
    public String display() {
        return "home";
    }

    @GetMapping("/sandwich")
    public String resultSandwich(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("condiments", condiment);
        return "home";
    }
}
