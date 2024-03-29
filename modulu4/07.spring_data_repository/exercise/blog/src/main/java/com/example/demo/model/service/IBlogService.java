package com.example.demo.model.service;

import com.example.demo.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IBlogService{
    Page<Blog> findAllByAuthorContains(String name, Pageable pageable);
    Page<Blog> findAll(Pageable pageable);
    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);
}
