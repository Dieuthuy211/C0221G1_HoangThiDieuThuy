package com.example.controler;

import com.example.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    private ICaculatorService caculatorService;

    @GetMapping("/")
    public String display(){
        return "home";
    }
    @PostMapping("/results")
    public String calculate(@RequestParam String numberOne,
                            @RequestParam String numberTwo,
                            Model model){
        int a=Integer.parseInt("numberOne");
        int b=Integer.parseInt("numberTwo");
        model.addAttribute("result","sum"+caculatorService.sum(a,b));
        model.addAttribute("result","volume"+caculatorService.volume(a,b));
        model.addAttribute("result","brand"+caculatorService.brand(a,b));
        model.addAttribute("result","dear"+caculatorService.dear(a,b));

        return "home";
    }
}
