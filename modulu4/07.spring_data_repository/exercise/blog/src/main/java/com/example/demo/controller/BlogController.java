package com.example.demo.controller;

import com.example.demo.model.entity.Blog;
import com.example.demo.model.entity.Category;
import com.example.demo.model.service.IBlogService;
import com.example.demo.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping("/blogs")
    public ModelAndView listCustomers(@PageableDefault(value =2 ) Pageable pageable) {
        Page<Blog> blogs = blogService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
    @GetMapping("/search")
    public ModelAndView listCustomers(@RequestParam("search") Optional<String> search, @PageableDefault(value =2 ) Pageable pageable) {
        Page<Blog> blogs;
        if(search.isPresent()){
            blogs = blogService.findAllByAuthorContains(search.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
      List<Category> categoryList=  categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("categoryList", categoryList);
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView save(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        List<Category> categoryList=  categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("categoryList", categoryList);
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        List<Category> categoryList=  categoryService.findAll();
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", blog);
            modelAndView.addObject("categoryList", categoryList);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView update(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        List<Category> categoryList=  categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("categoryList", categoryList);
        modelAndView.addObject("message", "blog updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:blogs";
    }
    @GetMapping("/view/{id}")
    public ModelAndView showView(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/view");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

}
