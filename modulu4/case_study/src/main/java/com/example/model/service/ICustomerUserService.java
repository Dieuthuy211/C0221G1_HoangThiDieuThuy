package com.example.model.service;


import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer_user_service.CustomerUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerUserService extends IGeneralService<CustomerUserService> {
    Page<CustomerUserService> findByNameContaining(String search, Pageable pageable);
}
