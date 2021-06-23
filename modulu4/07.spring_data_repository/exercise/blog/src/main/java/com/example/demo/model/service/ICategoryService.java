package com.example.demo.model.service;

import com.example.demo.model.entity.Blog;
import com.example.demo.model.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
