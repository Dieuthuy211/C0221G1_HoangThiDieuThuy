package com.example.model.entity.contract;

import com.example.model.entity.contract_detail.ContractDetail;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer_user_service.CustomerUserService;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Service;


import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "date")
    private String contractStartDate;
    @Column(columnDefinition = "date")
    private String contractEndDate;
    private Integer deposit;
    private  Integer total;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "id")
    private Service service;
    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;
    @OneToMany(mappedBy = "contract")
    private List<CustomerUserService> customerUserServices;
    public Contract() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
