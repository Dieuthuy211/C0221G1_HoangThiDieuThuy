package com.example.controller;

import com.example.dto.ProducerDto;
import com.example.model.entity.Producer;
import com.example.model.service.IProducerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping(value = {"/producers"})
public class ProducerController {
@Autowired
    IProducerService producerService;
    @GetMapping("")
    public ModelAndView listCustomers(@PageableDefault(value = 2) Pageable pageable) {

        ModelAndView modelAndView = new ModelAndView("/producer/list");
        Page<Producer> producers = producerService.findAll(pageable);
        modelAndView.addObject("producers",producers);
        return modelAndView;

    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/producer/create");
        modelAndView.addObject("producerDto", new ProducerDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute ProducerDto producerDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        Producer producer = new Producer();
        BeanUtils.copyProperties(producerDto, producer);
        if(bindingResult.hasErrors()){
            return "/producer/create";
        }else {
            producerService.save(producer);
            redirect.addFlashAttribute("message", "New blog created successfully");
            return "redirect:";
        }

    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Producer producer = producerService.findById(id);
        ProducerDto producerDto  = new ProducerDto();
        BeanUtils.copyProperties(producer,producerDto);
        if (producer != null) {
            ModelAndView modelAndView = new ModelAndView("/producer/edit");
            modelAndView.addObject("producerDto", producerDto);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public String update(@Validated @ModelAttribute ProducerDto producerDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        Producer producer  = new Producer();
        BeanUtils.copyProperties(producerDto,producer);
        if(bindingResult.hasErrors()){
            return "/producer/edit";
        }else {
            producerService.save(producer);
            redirect.addFlashAttribute("message", "blog updated successfully");
            return "redirect:";
        }
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Producer producer = producerService.findById(id);
        if (producer != null) {
            ModelAndView modelAndView = new ModelAndView("/producer/delete");
            modelAndView.addObject("producer", producer);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("producer") Producer producer) {
        producerService.remove(producer.getId());
        return "redirect:";
    }
}
