package com.example.dto;



import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.*;

public class UserDto {

    private Integer id;
    @NotEmpty
    @Size(min=5 , max= 45, message = "thấp nhất 5 kí tự, tối đa 45 kí tự,và không đc trống")
    private String firstName;
    @NotEmpty
    @Size(min=5 , max= 45, message = "thấp nhất 5 kí tự, tối đa 45 kí tự,và không đc trống")
    private String lastName;
    @NotNull
    @Min(value = 18,message = "Số tuổi phải lớn hơn hoặc bằng 18, và không đc trống")
    private Integer age;
    @NotEmpty
    @Pattern(regexp = "^0[0-9]{9}$",message = "Số điện thoại bắt đầu từ số 0 giới hạn 10 số,và không đc trống")
    private String phone;
    @NotEmpty
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$")
    private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
