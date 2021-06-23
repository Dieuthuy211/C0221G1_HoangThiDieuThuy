package com.example.demo.model.serviec;

import com.example.demo.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    List<Customer> finAll();
    Customer findById(Integer id);

    void save(Customer customer);

    void remove(Integer id);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllBytNameContaining(String name, Pageable pageable);
}
