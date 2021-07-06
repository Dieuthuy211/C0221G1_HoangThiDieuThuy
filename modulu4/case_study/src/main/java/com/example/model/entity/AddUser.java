package com.example.model.entity;

import com.example.model.entity.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class AddUser {
    @Id
    private String username;
    private String password;
    @OneToMany
    private List<Employee> employees;

    public AddUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
