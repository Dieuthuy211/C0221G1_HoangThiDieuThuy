package com.example.model.service;

import com.example.model.entity.customer.Customer;
import com.example.model.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findByNameContaining(String search, Pageable pageable);
    Page<Customer> findAll(Pageable pageable);
}
