package com.example.demo.model.service.impl;

import com.example.demo.model.entity.Blog;
import com.example.demo.model.entity.Category;
import com.example.demo.model.repository.ICategoryRepository;
import com.example.demo.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
