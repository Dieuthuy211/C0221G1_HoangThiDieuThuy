package com.example.dto;

import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EductionDegree;
import com.example.model.entity.employee.Position;

import javax.validation.constraints.*;

public class EmployeeDto {
    private Integer id;
    @NotBlank(message = "vui long nhập")
    private String name;
    @NotEmpty(message = "vui long nhập")
//    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$",message = "format DD/MM/YYYY")
    private String birthday;
    @Min(value = 0,message = "vui lòng nhập lại")
    private Integer salary;
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
    private Position position;
    private Division division;
    private EductionDegree eductionDegree;
    private Boolean flag=false;


    public EmployeeDto() {
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EductionDegree getEductionDegree() {
        return eductionDegree;
    }

    public void setEductionDegree(EductionDegree eductionDegree) {
        this.eductionDegree = eductionDegree;
    }
}
