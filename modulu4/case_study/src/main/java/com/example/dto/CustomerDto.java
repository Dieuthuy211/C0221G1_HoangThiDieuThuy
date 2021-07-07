package com.example.dto;

import com.example.model.entity.customer.CustomerType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CustomerDto {
    private Integer id;
    @NotBlank(message = "vui lòng nhập mã khach hàng")
    @Pattern(regexp = "^(KH)-[0-9]{4}$",message = "vui lòng nhập dúng dang KH-XXXX")
    private String code;
    private CustomerType customerType;
    @NotBlank(message = "vui long nhập")
    private String name;
    @NotBlank(message = "vui long nhập")
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$",message = "format DD/MM/YYYY")
    private String birthday;
    private String gender;
    @NotBlank(message = "vui long nhập")
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}",message = "id card 9 hoặc 12 số")
    private String idCard;
    @NotBlank(message = "vui long nhập")
    @Pattern(regexp = "^((090)|(091)|(\\(84\\)\\+(90))|(\\(84\\)+(91)))[0-9]{7}$",message = "vui long nhập đúng số điện thoại")
    private String phone;
    @NotBlank(message = "vui long nhập")
    @Email(message = "vui lòng nhập đúng đạng email")
    private String email;
    @NotBlank(message = "vui long nhập")
    private String address;

    public CustomerDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
