package com.example.demo.model.service;

import com.example.demo.model.entity.Blog;


import java.util.List;


public interface IBlogService{
    List<Blog> findAll();

    Blog findById(long id);

    void save(Blog blog);

    void remove(long id);
}
