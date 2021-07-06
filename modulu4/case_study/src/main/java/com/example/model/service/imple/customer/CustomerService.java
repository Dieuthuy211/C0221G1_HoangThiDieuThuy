package com.example.model.service.imple.customer;

import com.example.model.entity.customer.Customer;
import com.example.model.repository.customer.CustomerRepository;
import com.example.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
@Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void remove(Integer id) {
customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findByNameContaining(String search, Pageable pageable) {
        return customerRepository.findByNameContaining(search,pageable);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
}
