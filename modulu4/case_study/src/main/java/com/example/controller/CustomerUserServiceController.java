package com.example.controller;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract_detail.AttachService;
import com.example.model.entity.customer_user_service.CustomerUserService;
import com.example.model.entity.service.Service;
import com.example.model.service.IAttachService;
import com.example.model.service.IContractService;
import com.example.model.service.ICustomerUserService;
import com.example.model.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customerUsers")
public class CustomerUserServiceController {
    @Autowired
    ICustomerUserService customerUserService;
    @Autowired
    IAttachService attachService;
    @Autowired
    IContractService contractService;
    @Autowired
    IServiceService serviceService;
    @GetMapping(value = "")
    public String showList(@RequestParam("search") Optional<String> search, @PageableDefault(value = 5) Pageable pageable, Model model){
        List<AttachService> attachServices=attachService.findAll();
        String searchValue="";
        if(search.isPresent()){
            searchValue=search.get();
        }
        Page<CustomerUserService> customerUserServices=customerUserService.findByNameContaining(searchValue,pageable);
        model.addAttribute("attachServices",attachServices);
        model.addAttribute("customerUserServices",customerUserServices);
        return "/customer_user_service/list";
    }
    @GetMapping(value = "/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id,Model model){
        Contract contract=contractService.findById(id);
        List<Service> services=serviceService.findAll();
        model.addAttribute("contract",contract);
        model.addAttribute("services",services);
        return "/customer_user_service/edit";
    }
    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute("contract") Contract contract){
        if(contract!=null){
            contractService.save(contract);
            return "redirect:/customerUsers/";
        }else {
            return "error.404";
        }
    }
    @GetMapping(value = "/delete/{id}")
    public String ShowDelete(@PathVariable("id") Integer id,Model model){
        Contract contract=contractService.findById(id);
        List<Service> services=serviceService.findAll();
        model.addAttribute("contract",contract);
        model.addAttribute("services",services);
        return "/customer_user_service/delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute("contract") Contract contract,Model model){
        contractService.remove(contract.getId());
        return "redirect:/customerUsers/";
    }
}
