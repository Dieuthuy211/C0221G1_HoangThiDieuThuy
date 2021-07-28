package model.service.impl;

import model.bean.Employee;
import model.repository.EmployeeRepository;
import model.service.IEmployee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployee {
    EmployeeRepository employeeRepository=new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.listEmployee();
    }

    @Override
    public Map<String, String> insert(Employee employee) {
        Map<String, String> mapMsg = new HashMap<>();
        boolean flag = true;

        if ("".equals(employee.getName())) {
            mapMsg.put("name", "Please input name");
            flag = false;
        }

        if ("".equals(employee.getBirthday())) {
            mapMsg.put("birthday", "Please input email");
            flag = false;
        } else if (!employee.getBirthday().matches("^[12]{1}[0-9]{3}\\-(0{1}[1-9]{1}|1[012]{1})\\-([012][0-9]{1}|3[01]{1})$")) {
            mapMsg.put("birthday", "Invalid format birthday. Hint: YYYY/XX/YY");
            flag = false;
        }

        if (flag) {
            employeeRepository.insert(employee);
        }

        return mapMsg;

    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.listById(id);
    }

    @Override
    public Map<String, String> update(Employee employee) {

        Map<String,String> mapMsg = new HashMap<>();
        boolean flag = true;

        if ("".equals(employee.getName())) {
            mapMsg.put("name", "Please input name");
            flag = false;
        }

        if ("".equals(employee.getBirthday())) {
            mapMsg.put("birthday", "Please input email");
            flag = false;
        } else if (!employee.getBirthday().matches("^[12]{1}[0-9]{3}\\-(0{1}[1-9]{1}|1[012]{1})\\-([012][0-9]{1}|3[01]{1})$")) {
            mapMsg.put("birthday", "Invalid format birthday. Hint: YYYY/XX/YY");
            flag = false;
        }

        if (flag) {
            employeeRepository.update(employee);
        }

        return mapMsg;
    }

    @Override
    public boolean delete(int id) {
        return employeeRepository.delete(id);
    }

    @Override
    public List<Employee> search(String search) {
        return employeeRepository.search(search);
    }
}
