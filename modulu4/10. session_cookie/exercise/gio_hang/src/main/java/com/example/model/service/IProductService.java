package com.example.model.service;

import com.example.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAllByNameContaining(String search, Pageable pageable);
    Product findById(Integer id);
}
