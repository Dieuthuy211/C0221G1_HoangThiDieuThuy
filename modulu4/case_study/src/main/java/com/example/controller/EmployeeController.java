package com.example.controller;

import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EductionDegree;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.employee.Position;
import com.example.model.service.IDivisionService;
import com.example.model.service.IEducationDegreeService;
import com.example.model.service.IEmployeeService;
import com.example.model.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IEducationDegreeService educationDegreeService;
    @Autowired
    IPositionService positionService;
    @Autowired
    IDivisionService divisionService;

    @GetMapping(value = "")
    public String showEmployee(@RequestParam("search") Optional<String> search, @PageableDefault(value = 5) Pageable pageable, Model model) {
        String searchValue = "";
        if (search.isPresent()) {
            searchValue = search.get();
        }
        Page<Employee> employees = employeeService.findByNameContaining(searchValue, pageable);
        model.addAttribute("employees", employees);
        return "employee/list";
    }
    @GetMapping(value = "/create")
    public String showCreate(Model model){
        List<Position> positions=positionService.findAll();
        List<Division> divisions=divisionService.findAll();
        List<EductionDegree> eductionDegrees=educationDegreeService.findAll();
        model.addAttribute("positions",positions);
        model.addAttribute("divisions",divisions);
        model.addAttribute("eductionDegrees",eductionDegrees);
        model.addAttribute("employee",new Employee());
        return "/employee/create";
    }
    @PostMapping(value = "/create")
    public String createEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes){

        if(employee!=null){
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("msg","tạo thành công");
            return "redirect:/employees/";
        }else {
            return "error.404";
        }
    }
    @GetMapping(value = "/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id,Model model){
        Employee employee=employeeService.findById(id);
        List<Position> positions=positionService.findAll();
        List<Division> divisions=divisionService.findAll();
        List<EductionDegree> eductionDegrees=educationDegreeService.findAll();
        model.addAttribute("positions",positions);
        model.addAttribute("divisions",divisions);
        model.addAttribute("eductionDegrees",eductionDegrees);
        model.addAttribute("employee",employee);
        return "/employee/edit";
    }
    @PostMapping(value = "/edit")
    public String editEmployee(@ModelAttribute("employee")Employee employee,RedirectAttributes redirectAttributes){
        if(employee!=null){
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("msg","update thành công");
            return "redirect:/employees/";
        }else {
            return "error.404";
        }
    }
    @GetMapping(value = "/delete/{id}")
    public String showDelete(@PathVariable("id") Integer id,Model model){
        Employee employee=employeeService.findById(id);
        model.addAttribute("employee",employee);
        return "/employee/delete";
    }
    @PostMapping(value = "/delete")
    public String deleteEmployee(@ModelAttribute("id") Integer id,RedirectAttributes redirectAttributes){
        employeeService.remove(id);
        redirectAttributes.addFlashAttribute("msg","xóa thành công");
        return "redirect:/employees/";
    }
}
