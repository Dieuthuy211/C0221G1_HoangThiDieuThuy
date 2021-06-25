package com.example.dto;



import javax.validation.constraints.*;

public class UserDto{
    private Integer id;

    @NotEmpty(message = "please input first name")
    @Size(min = 5, max = 45, message = "Minimum length 5, maximum 45 characters ")
    private String firstName;

    @NotEmpty(message = "please input last name")
    @Size(min = 5, max = 45, message = "Minimum length 5, maximum 45 characters ")
    private String lastName;
    @NotNull
//    @NotBlank(message = "please input age")
//    @NotEmpty(message = "please input age")
    @Min(value = 18, message = "over 18 years")
    private Integer age;

    @NotBlank(message = "please input phone")
    @Pattern(regexp = "^(09|08)[0-9]{8}$",message = "Please input the correct phone number")
    private String phone;

    @NotBlank(message = "please input email")
    @Email(message = "Please input the correct email format")
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
}
