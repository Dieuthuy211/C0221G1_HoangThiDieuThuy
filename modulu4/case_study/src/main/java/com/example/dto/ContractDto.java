package com.example.dto;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractDto implements Validator {
    private Integer id;
    @NotBlank(message = "vui long nhập")
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-\\d{4}$",message = "format DD/MM/YYYY")
    private String contractStartDate;
    @NotBlank(message = "vui long nhập")
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-\\d{4}$",message = "format DD/MM/YYYY")
    private String contractEndDate;
    @Min(value = 0, message = "vui long nhập lại")
    private Integer deposit;
    private Integer total;
    private Employee employee;
    private Customer customer;
    private Service service;

    public ContractDto() {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractDto contractDto = (ContractDto) target;
        try {
            Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse(contractDto.contractEndDate);
            Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse(contractDto.contractStartDate);
            if(endDate.before(startDate)==true){
                errors.rejectValue("contractStartDate","start.Date","nhập sai ngày vui lòng nhập lại");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
