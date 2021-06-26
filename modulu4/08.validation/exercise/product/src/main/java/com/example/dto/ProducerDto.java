package com.example.dto;

import javax.validation.constraints.NotEmpty;

public class ProducerDto {
    private Integer id;
    @NotEmpty(message = "vui long nhập hảng sản xuất")
    private String name;

    public ProducerDto() {
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
}
