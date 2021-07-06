package com.example.controller;

import com.example.model.entity.service.RentType;
import com.example.model.entity.service.Service;
import com.example.model.entity.service.ServiceType;
import com.example.model.service.IRentTypeService;
import com.example.model.service.IServiceService;
import com.example.model.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/services")
public class ServiceController {
    @Autowired
    IServiceTypeService serviceTypeService;
    @Autowired
    IRentTypeService rentTypeService;
    @Autowired
    IServiceService serviceService;
    @GetMapping(value = "")
    public String showCreate(Model model){
        List<RentType> rentTypes=rentTypeService.findAll();
        List<ServiceType> serviceTypes=serviceTypeService.findAll();
        model.addAttribute("rentTypes",rentTypes);
        model.addAttribute("serviceTypes",serviceTypes);
        model.addAttribute("service",new Service());
        return "/service/create";
    }
    @PostMapping(value = "/create")
    public String createService(@ModelAttribute("service") Service service,Model model){
        serviceService.save(service);
        List<RentType> rentTypes=rentTypeService.findAll();
        List<ServiceType> serviceTypes=serviceTypeService.findAll();
        model.addAttribute("rentTypes",rentTypes);
        model.addAttribute("serviceTypes",serviceTypes);
        model.addAttribute("msg","tạo thanh công");
        return "/service/create";

    }

}
