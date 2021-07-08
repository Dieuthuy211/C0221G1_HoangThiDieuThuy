package com.example.controller;

import com.example.dto.ContractDto;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Service;
import com.example.model.service.IContractService;
import com.example.model.service.ICustomerService;
import com.example.model.service.IEmployeeService;
import com.example.model.service.IServiceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        model.addAttribute("contractDto",new ContractDto());
        return "contract/create";
    }
    @PostMapping(value = "create")
    public String createContract(@Valid @ModelAttribute("contractDto") ContractDto contractDto, BindingResult bindingResult, Model model) throws ParseException {
        Contract contract=new Contract();

        BeanUtils.copyProperties(contractDto,contract);
        List<Customer> customers=customerService.findAll();
        List<Employee> employees=employeeService.findAll();
        List<Service> services=serviceService.findAll();

        if(bindingResult.hasErrors()) {
            model.addAttribute("customers", customers);
            model.addAttribute("employees", employees);
            model.addAttribute("services", services);
            return "contract/create";
        } else {
            contractService.save(contract);
            model.addAttribute("customers", customers);
            model.addAttribute("employees", employees);
            model.addAttribute("services", services);
            model.addAttribute("msg","tạo thành công");
            return "contract/create";
        }
    }

}
