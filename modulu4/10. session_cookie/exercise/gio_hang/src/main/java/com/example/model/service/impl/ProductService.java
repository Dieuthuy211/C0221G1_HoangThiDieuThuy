package com.example.model.service.impl;

import com.example.model.entity.Product;
import com.example.model.repository.IProductRepository;
import com.example.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
@Autowired
    IProductRepository productRepository;
    @Override
    public Page<Product> findAllByNameContaining(String search, Pageable pageable) {
        return productRepository.findAllByNameContaining("%"+search+"%",pageable);
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
