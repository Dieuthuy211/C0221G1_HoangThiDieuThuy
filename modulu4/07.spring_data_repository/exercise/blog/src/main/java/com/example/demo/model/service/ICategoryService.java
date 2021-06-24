package com.example.demo.model.service;


import com.example.demo.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Page<Category> findAll(Pageable pageable);


    Category findById(Integer id);

    void save(Category category);

    void remove(Integer id);
}
