package model.service.impl;


import model.bean.Employee;
import model.bean.ServiceType;
import model.repository.EmployeeRepository;
import model.service.IService;

import java.util.List;

public class EmployeeServiceImp implements IService<Employee> {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.employeeList();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.insertCustomer(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.selectOneEmployee(id);
    }

    @Override
    public boolean update(Employee employee) {
        return employeeRepository.updateEmployess(employee);
    }

    @Override
    public boolean remove(int id) {
        return employeeRepository.delete(id);
    }

    @Override
    public List<Employee> search(String search) {
        return employeeRepository.search(search);
    }

    @Override
    public List<ServiceType> select() {
        return null;
    }
}
