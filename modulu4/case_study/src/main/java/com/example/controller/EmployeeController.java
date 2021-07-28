package com.example.controller;

import com.example.dto.EmployeeDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EductionDegree;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.employee.Position;
import com.example.model.service.IDivisionService;
import com.example.model.service.IEducationDegreeService;
import com.example.model.service.IEmployeeService;
import com.example.model.service.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
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
    public String showEmployee(@RequestParam("name") Optional<String> name,
                               @RequestParam("birthday") Optional<String> birthday,
                               @PageableDefault(value = 2) Pageable pageable, Model model) {
        Page<Employee> employees = employeeService.findByNameContaining(name.orElse(""),birthday.orElse(""), pageable);
        model.addAttribute("employees", employees);
        model.addAttribute("name", name.orElse(""));
        model.addAttribute("birthday", birthday.orElse(""));
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
        model.addAttribute("employeeDto",new EmployeeDto());
        return "/employee/create";
    }
    @PostMapping(value = "/create")
    public String createEmployee(@Valid @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model){
        Employee employee=new Employee();
        List<Position> positions=positionService.findAll();
        List<Division> divisions=divisionService.findAll();
        List<EductionDegree> eductionDegrees=educationDegreeService.findAll();
        BeanUtils.copyProperties(employeeDto,employee);
        if(bindingResult.hasErrors()){
            model.addAttribute("positions",positions);
            model.addAttribute("divisions",divisions);
            model.addAttribute("eductionDegrees",eductionDegrees);
            return "/employee/create";
        }
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("msg","tạo thành công");
            return "redirect:/employees/";

    }
    @GetMapping(value = "/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id,Model model){
        Employee employee=employeeService.findById(id);
        EmployeeDto employeeDto=new EmployeeDto();
        BeanUtils.copyProperties(employee,employeeDto);
        List<Position> positions=positionService.findAll();
        List<Division> divisions=divisionService.findAll();
        List<EductionDegree> eductionDegrees=educationDegreeService.findAll();
        model.addAttribute("positions",positions);
        model.addAttribute("divisions",divisions);
        model.addAttribute("eductionDegrees",eductionDegrees);
        model.addAttribute("employeeDto",employeeDto);
        return "/employee/edit";
    }
    @PostMapping(value = "/edit")
    public String editEmployee(@ModelAttribute("employeeDto")EmployeeDto employeeDto,BindingResult bindingResult,RedirectAttributes redirectAttributes,Model model){
        Employee employee=new Employee();
        List<Position> positions=positionService.findAll();
        List<Division> divisions=divisionService.findAll();
        List<EductionDegree> eductionDegrees=educationDegreeService.findAll();
        BeanUtils.copyProperties(employeeDto,employee);

        if(bindingResult.hasErrors()){

            model.addAttribute("positions",positions);
            model.addAttribute("divisions",divisions);
            model.addAttribute("eductionDegrees",eductionDegrees);
            return "/employee/edit";
        }

            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("msg","update thành công");
            return "redirect:/employees/";
    }
//    @PostMapping(value = "/delete")
//    public String delete(@RequestParam Integer id,RedirectAttributes redirectAttributes){
//        Employee employee=employeeService.findById(id);
//        if(employee==null){
//            return "error.404";
//
//        }else {
//            employee.setFlag(true);
//            employeeService.save(employee);
//            redirectAttributes.addFlashAttribute("msg","xóa thành công");
//            return "redirect:/employees/";
//        }
//
//    }
    @PostMapping("/delete")
    public ModelAndView delete(@RequestParam("listId") Optional<List<Integer>> listId, RedirectAttributes redirectAttributes){
        if (listId.isPresent()){
            for (Integer id: listId.get()) {
                Employee employee=employeeService.findById(id);
                if (employee==null){
                    return new ModelAndView("error.404");
                }
                employee.setFlag(true);
                employeeService.save(employee);
            }
            redirectAttributes.addFlashAttribute("msg","Delete is successful!!");
            return new ModelAndView("redirect:/employees/");
        }
        return new ModelAndView("redirect:/employees/");
    }
}


