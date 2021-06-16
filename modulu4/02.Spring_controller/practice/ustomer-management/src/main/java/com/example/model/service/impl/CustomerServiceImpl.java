package com.example.model.service.impl;

import com.example.model.bean.Customer;
import com.example.model.repository.ICustomerRepository;
import com.example.model.repository.impl.CustomerRepository;
import com.example.model.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {
    ICustomerRepository customerRepository=new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
}
