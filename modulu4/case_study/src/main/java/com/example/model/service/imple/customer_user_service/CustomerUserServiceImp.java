package com.example.model.service.imple.customer_user_service;

import com.example.model.entity.customer_user_service.CustomerUserService;
import com.example.model.repository.customer_user_service.CustomerUserServiceRepository;
import com.example.model.service.ICustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerUserServiceImp implements ICustomerUserService {
    @Autowired
    CustomerUserServiceRepository customerUserServiceRepository;
    @Override
    public Page<CustomerUserService> findByNameContaining(String search, Pageable pageable) {
        return customerUserServiceRepository.findByCustomerContaining(pageable) ;
    }

    @Override
    public List<CustomerUserService> findAll() {
        return null;
    }

    @Override
    public CustomerUserService findById(Integer id) {
        return null;
    }

    @Override
    public void save(CustomerUserService customerUserService) {

    }

    @Override
    public void remove(Integer id) {

    }
}
