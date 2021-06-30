package com.example.model.service;


import com.example.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IBlogService{

    List<Blog> findAll();
    List<Blog> blogBYIdCategory(Integer id);
    Blog findById(Integer id);
}
