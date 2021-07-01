package com.example.model.service;


import com.example.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IBlogService{

    Page<Blog> findAllByAuthorContains( String search, Pageable pageable);
    Blog findById(Integer id);
    List<Blog> findAll();
}
