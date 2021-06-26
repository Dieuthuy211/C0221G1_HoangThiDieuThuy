package com.example.controller;

import com.example.dto.ProducerDto;
import com.example.dto.ProductDto;
import com.example.model.entity.Producer;
import com.example.model.entity.Product;
import com.example.model.service.IProducerService;
import com.example.model.service.IProductService;
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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping(value = {"/products", "/"})
public class ProductController {
    @Autowired
    IProductService productService;
    @Autowired
    IProducerService iProducerService;


    @GetMapping("/products")
    public ModelAndView listCustomers(@RequestParam("search") Optional<String> search, @PageableDefault(value = 2) Pageable pageable) {
        String searchValue = "";
        if (search.isPresent()) {
            searchValue = search.get();
        }
        ModelAndView modelAndView = new ModelAndView("/product/list");
        Page<Product> products = productService.findAllByNameContains(searchValue, pageable);
        modelAndView.addObject("searchValue", searchValue);
        modelAndView.addObject("products", products);
        return modelAndView;

    }

    @GetMapping("/products/create")
    public ModelAndView showCreateForm() {
        List<Producer> producers = iProducerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("productDto", new ProductDto());
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("producers", producers);
        return modelAndView;
    }

    @PostMapping("/products/create")
    public String save(@Validated @ModelAttribute ProductDto productDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect,
                       Model model) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        if (bindingResult.hasFieldErrors()) {
            List<Producer> producers = iProducerService.findAll();
            model.addAttribute("producers", producers);
            return "/product/create";
        } else {
            productService.save(product);
            redirect.addFlashAttribute("message", "Create User successfully !");
            return "redirect:/products";
        }

    }

    @GetMapping("/products/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Product product = productService.findById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        List<Producer> producers = iProducerService.findAll();
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("productDto", productDto);
            modelAndView.addObject("producers", producers);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/products/edit")
    public String update(@Validated @ModelAttribute ProductDto productDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirect,
                         Model model) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);

        if (bindingResult.hasFieldErrors()) {
            List<Producer> producers = iProducerService.findAll();
            model.addAttribute("producers", producers);
            return "/product/edit";
        } else {
            productService.save(product);
            List<Producer> producers = iProducerService.findAll();
            redirect.addFlashAttribute("message", "blog updated successfully");
            return "redirect:/products";
        }
    }


    @GetMapping("/products/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/delete");
            modelAndView.addObject("product", product);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/products/delete")
    public String delete(@ModelAttribute("product") Product product) {
        productService.remove(product.getId());
        return "redirect:/products/";
    }

    @GetMapping("/products/view/{id}")
    public ModelAndView showView(@PathVariable Integer id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/view");
            modelAndView.addObject("product", product);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
}
