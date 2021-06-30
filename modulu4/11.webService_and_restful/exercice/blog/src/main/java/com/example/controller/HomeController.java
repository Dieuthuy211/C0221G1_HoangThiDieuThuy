package com.example.controller;

import com.example.model.entity.Blog;
import com.example.model.entity.Category;
import com.example.model.service.IBlogService;
import com.example.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping(value = "/blogRest")
public class HomeController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;
    @GetMapping(value = {"/category"})
    public ResponseEntity<List<Category>> getListCategory(){
        List<Category> categories=categoryService.findAll();
        if(categories.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories,HttpStatus.OK);
    }
    @GetMapping(value = "/blog")
    public ResponseEntity<List<Blog>> getListBlog(){
        List<Blog> blogs=blogService.findAll();
        if(blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }
    @GetMapping(value = "/category/{id}")
    public ResponseEntity<List<Blog>> getIdCategory(@PathVariable Integer id){
        List<Blog> blogs=blogService.blogBYIdCategory(id);
        if(blogs.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }
    @GetMapping(value = "/blog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Integer id){
        Blog blog=blogService.findById(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
}
