package model.service.impl;

import model.bean.Employee;
import model.repository.EmployeeRepository;
import model.service.IEmployee;

import java.util.List;

public class EmployeeService implements IEmployee {
    EmployeeRepository employeeRepository=new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.listEmployee();
    }

    @Override
    public void insert(Employee employee) {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Employee> search(String search) {
        return null;
    }
}
