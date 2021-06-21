package com.example.controller;

import com.example.service.ITuDien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TuDienController {
    @Autowired
    ITuDien tuDien;

    @GetMapping("/")
    public String home(){
        return "/home";
    }
    @PostMapping("/tuDien")
    private String tuDien(@RequestParam String input, Model model){
        model.addAttribute("result",tuDien.chuyenDoi(input));
        return "/home";
    }
}
