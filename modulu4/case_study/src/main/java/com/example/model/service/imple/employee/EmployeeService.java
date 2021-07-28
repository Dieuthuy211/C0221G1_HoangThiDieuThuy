package com.example.model.service.imple.employee;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.repository.employee.EmployeeRepository;
import com.example.model.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findByNameContaining(String name, String birthday, Pageable pageable) {
        return employeeRepository.findByNameContaining(name, birthday, pageable);
    }

//    @Override
//    public Page<Employee> findByNameContaining(String search, Pageable pageable) {
//        return employeeRepository.findByNameContaining(search, pageable);
//    }
}
