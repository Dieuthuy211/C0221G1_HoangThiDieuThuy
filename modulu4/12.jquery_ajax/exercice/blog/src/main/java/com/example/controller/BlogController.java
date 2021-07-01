package com.example.controller;

import com.example.model.entity.Blog;
import com.example.model.service.IBlogService;
import com.example.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/blogRest")
@CrossOrigin
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;
    @GetMapping("/blogs")
    public ResponseEntity<Page<Blog>> listBlog(@RequestParam("search") Optional<String> search,@RequestParam int page) {
        Page<Blog> blogs;
        String searchValue = "";
        if (search.isPresent()) {
            searchValue = search.get();

        }
        Pageable pageable= PageRequest.of(page,2);
         blogs =blogService.findAllByAuthorContains(searchValue,pageable );

        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @GetMapping("/blog_search")
    public ResponseEntity<Page<Blog>> listBlog(@RequestParam("search") Optional<String> search, Pageable pageable) {

        String searchValue = "";
        if (search.isPresent()) {
            searchValue = search.get();

        }
        Page<Blog> blogs =blogService.findAllByAuthorContains(searchValue,pageable);

        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}
