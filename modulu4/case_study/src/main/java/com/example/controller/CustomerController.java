package com.example.controller;

import com.example.dto.CustomerDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;
import com.example.model.service.ICustomerService;
import com.example.model.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    private ICustomerTypeService customerTypeService;
    @Autowired
    private ICustomerService customerService;
    @GetMapping(value = "")
    public String showCustomer(Model model, @RequestParam("search") Optional<String> search,@PageableDefault(value = 5) Pageable pageable){
        String searchValue="";
        if(search.isPresent()) {
            searchValue = search.get();
        }
        Page<Customer> customers=customerService.findByNameContaining(searchValue,pageable);
        model.addAttribute("customers",customers);
        return "customer/list";
    }
    @GetMapping(value = "/create")
    public String showCreate(Model model){
        List<CustomerType> customerTypes =customerTypeService.findAll();
        model.addAttribute("customerTypes",customerTypes);
        model.addAttribute("customerDto",new CustomerDto());
        return "customer/create";
    }
    @PostMapping(value = "/create")
    public String createCustomer(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        if(bindingResult.hasErrors()){
            return "customer/create";
        }else {
            customerService.save(customer);
            List<CustomerType> customerTypes = customerTypeService.findAll();
            model.addAttribute("customerTypes", customerTypes);
            redirectAttributes.addFlashAttribute("msg", "tạo thành công");
            return "redirect:/customers/";
        }
    }
    @GetMapping(value = "/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id,  Model model){
        Customer customer=customerService.findById(id);
        CustomerDto customerDto=new CustomerDto();
        BeanUtils.copyProperties(customer,customerDto);
        List<CustomerType> customerTypes =customerTypeService.findAll();
        model.addAttribute("customerTypes",customerTypes);
        model.addAttribute("customerDto",customerDto);
        return "customer/edit";
    }
    @PostMapping(value = "/edit")
    public String editCustomer(@Valid@ModelAttribute("customerDto") CustomerDto customerDto,BindingResult bindingResult,Model model,RedirectAttributes redirectAttributes){
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        if(bindingResult.hasErrors()){
            return "customer/edit";
        }
        customerService.save(customer);
        List<CustomerType> customerTypes =customerTypeService.findAll();
            model.addAttribute("customerTypes",customerTypes);
            redirectAttributes.addFlashAttribute("msg","sủa thành công");
            return "redirect:/customers/";
    }

    @PostMapping(value = "/delete")
    public String delete(@RequestParam Integer id,RedirectAttributes redirectAttributes){
        Customer customer=customerService.findById(id);
        if(customer==null){
            return "error.404";

        }else {
            customer.setFlag(true);
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("msg","xóa thành công");
            return "redirect:/customers/";
        }

    }
    @GetMapping(value = "/view/{id}")
    public String showView(@PathVariable("id") Integer id,Model model){
        Customer customer=customerService.findById(id);
        model.addAttribute("customer",customer);
        return "customer/view";
    }
}
