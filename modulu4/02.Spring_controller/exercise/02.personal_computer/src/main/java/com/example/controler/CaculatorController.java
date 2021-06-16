package com.example.controler;

import com.example.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    private ICaculatorService caculatorService;

    @GetMapping("/")
    public String display(){
        return "/home";
    }
    @PostMapping("/Calculator")
    public String calculate(@RequestParam String numberOne,
                            @RequestParam String numberTwo,
                            @RequestParam String action,
                            Model model){

         double a=Double.parseDouble(numberOne);
         double b=Double.parseDouble(numberTwo);
         double result=0;
         try {
             result = caculatorService.calculate(a, b, action);
         }catch (ArithmeticException  e){
             model.addAttribute("message","phep tinh khong hop le");
         }
         model.addAttribute("numberOne",numberOne);
         model.addAttribute("numberTwo",numberTwo);
         model.addAttribute("result",result);


        return "/home";
    }
}
