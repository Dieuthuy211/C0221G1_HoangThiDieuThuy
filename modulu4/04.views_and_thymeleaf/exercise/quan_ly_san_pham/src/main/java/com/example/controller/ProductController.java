package com.example.controller;

import com.example.model.bean.Product;
import com.example.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
@RequestMapping(value = {"/product", "/"})
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping(value ="")
    public String showList(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "list";
    }

    @GetMapping(value = "/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping(value = "/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/product/";
    }

    @GetMapping(value = "/{productId}/edit")
    public String showEdit(@PathVariable int productId, Model model) {
        model.addAttribute("product", productService.findById(productId));
        return "edit";
    }

    @PostMapping(value = "/update")
    public String update(Product product) {
        productService.update(product.getProductId(), product);
        return "redirect:/product/";
    }


    @PostMapping(value = "/delete")
    public String delete(@RequestParam int id) {
        productService.remove(id);
        return "redirect:/product/";

    }

    @GetMapping(value = "/{productId}/view")
    public String ShowView(@PathVariable int productId, Model model) {
        model.addAttribute("product", productService.findById(productId));
        return "view";
    }

    @PostMapping(value = "/search")
    public String search(@RequestParam String name,Model model) {
        List<Product> products = productService.search(name);
        model.addAttribute("products", products);
        return "list";

    }
}
