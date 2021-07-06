package com.example.controller;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Service;
import com.example.model.service.IContractService;
import com.example.model.service.ICustomerService;
import com.example.model.service.IEmployeeService;
import com.example.model.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/contracts")
public class ContractController {
    @Autowired
    IContractService contractService;
    @Autowired
    IServiceService serviceService;
    @Autowired
    ICustomerService customerService;
    @Autowired
    IEmployeeService employeeService;
    @GetMapping(value = "")
    public String showCreate(Model model){
        List<Customer> customers=customerService.findAll();
        List<Employee> employees=employeeService.findAll();
        List<Service> services=serviceService.findAll();
        model.addAttribute("customers",customers);
        model.addAttribute("employees",employees);
        model.addAttribute("services",services);
        model.addAttribute("contract",new Contract());
        return "contract/create";
    }
    @PostMapping(value = "create")
    public String createContract(@ModelAttribute("contract") Contract contract,Model model){
        contractService.save(contract);
        List<Customer> customers=customerService.findAll();
        List<Employee> employees=employeeService.findAll();
        List<Service> services=serviceService.findAll();
        model.addAttribute("customers",customers);
        model.addAttribute("employees",employees);
        model.addAttribute("services",services);
        return "contract/create";
    }

}
