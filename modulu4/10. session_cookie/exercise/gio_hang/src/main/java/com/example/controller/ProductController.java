package com.example.controller;

import com.example.model.entity.Cart;
import com.example.model.entity.Product;
import com.example.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping(value = "")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    IProductService productService;

    @ModelAttribute("cart")
    private Cart setupCart() {
        return new Cart();
    }

    @GetMapping(value = "")
    public String showProduct(@RequestParam("search") Optional<String> search, @PageableDefault(value = 2) Pageable pageable, Model model) {
        String searchValue = "";
        if (search.isPresent()) {
            searchValue = search.get();
        }
        Page<Product> products = productService.findAllByNameContaining(searchValue, pageable);
        model.addAttribute("products", products);
        model.addAttribute("searchValue", searchValue);
        return "list";
    }

    @GetMapping("/view/{id}")
    public ModelAndView showView(@PathVariable Integer id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("view");
            modelAndView.addObject("product", product);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @GetMapping("/add/{id}")
    private String addToCart(@PathVariable Integer id,
                             @ModelAttribute Cart cart,
                             @RequestParam("action") String action) {
        Product product = productService.findById(id);
        if (product == null) {
            return "error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(product);
            return "redirect:/shopping";
        }
        if (action.equals("cut")){
            cart.cutProduct(product);
            return "redirect:/shopping";
        }
        cart.addProduct(product);
        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    public String delete(@ModelAttribute Cart cart,@PathVariable Integer id){
        cart.deleteProduct(productService.findById(id));
        return "redirect:/shopping";
    }

}
