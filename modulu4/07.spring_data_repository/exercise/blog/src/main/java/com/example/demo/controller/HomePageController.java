package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping(value = {"/home","/"})
@Controller
public class HomePageController {
    @GetMapping(value = "/")
    private String showHome(){
        return"/homePage/home" ;
    }
}
