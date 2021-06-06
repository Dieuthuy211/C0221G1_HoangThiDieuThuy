package model.service.impl;


import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.customer.CustomerType;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.ServiceType;
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

    @Override
    public List<CustomerType> selectCustomerType() {
        return null;
    }

    @Override
    public List<Position> selectPosition() {
        return employeeRepository.selectPosition();
    }

    @Override
    public List<Division> selectDivision() {
        return employeeRepository.selectDivision();
    }

    @Override
    public List<EducationDegree> selectEducationDegree() {
        return employeeRepository.selectEducationDegree();
    }

    @Override
    public List<RentType> selectRentType() {
        return null;
    }

    @Override
    public List<AttachService> selectAttachService() {
        return null;
    }

    @Override
    public List<AmountOfServicesIncluded> selectAmount() {
        return null;
    }
}
