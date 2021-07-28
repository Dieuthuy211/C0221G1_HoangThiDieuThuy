package com.example.model.service;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService extends IGeneralService<Employee> {
//    Page<Employee> findByNameContaining(String search, Pageable pageable);
Page<Employee> findByNameContaining(String name,String birthday, Pageable pageable);
}
