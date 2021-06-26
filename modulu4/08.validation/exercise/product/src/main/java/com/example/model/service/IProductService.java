package com.example.model.service;

import com.example.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> findAllByNameContains(String name, Pageable pageable);
    List<Product> findAll();

    Product findById(Integer id);

    void save(Product product);

    void remove(Integer id);


}
