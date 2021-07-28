package model.service;

import model.bean.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployee {
    List<Employee> findAll();

    Map<String, String>  insert(Employee employee);

    Employee findById(int id);

    Map<String, String> update(Employee employee);

    boolean delete(int id);
    List<Employee> search(String search);
}
