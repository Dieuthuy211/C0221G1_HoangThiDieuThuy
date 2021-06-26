package com.example.dto;

import com.example.model.entity.Producer;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class ProductDto {
    private Integer id;

    @NotEmpty(message = "vui long nhập tên sản phẩm")
    private String name;

    @NotEmpty(message = "vui lòng nhập gái sản phẩm")
    @Positive(message = "vui lòng nhập số dương")
    private String price;

    @NotEmpty(message = "vui lòng nhập mô tả sản phẩm")
    private String description;

    private Producer producer;

    public ProductDto() {
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
