package com.example.model.service.imple.customer;

import com.example.model.entity.customer.CustomerType;
import com.example.model.repository.customer.CustomerTypeRepository;
import com.example.model.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll() ;
    }

    @Override
    public CustomerType findById(Integer id) {
        return null;
    }

    @Override
    public void save(CustomerType customerType) {

    }

    @Override
    public void remove(Integer id) {

    }
}
