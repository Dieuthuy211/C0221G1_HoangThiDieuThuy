package com.example.controller;

import com.example.service.IConventer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConventerController {
    @Autowired
    IConventer iConventer;

    @GetMapping
    public String home(){
        return "/home";
    }
  @PostMapping("/convert")
  public String convert(@RequestParam String rate, String usd, Model model){
        int a=Integer.parseInt(rate);
        int b=Integer.parseInt(usd);
        model.addAttribute("rate",rate);
        model.addAttribute("usd",usd);

        model.addAttribute("result",iConventer.dear(a,b));

        return "/home";
  }
}
