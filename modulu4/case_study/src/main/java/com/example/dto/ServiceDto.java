package com.example.dto;

import com.example.model.entity.service.RentType;
import com.example.model.entity.service.ServiceType;
import com.sun.istack.NotNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class ServiceDto {
    private Integer id;
    @NotBlank(message = "vui lòng nhập")
    @Pattern(regexp = "^(DV)-[0-9]{4}$",message = "DV-XXXX")
    private String code;
    @NotBlank(message = "vui lòng nhập")
    private String name;
    @Min(value = 0,message = "vui lòng nhập lại")
    private Integer areas;
    @Min(value = 0,message = "vui lòng nhập lại")
    private Integer costs;
    @Min(value = 0,message = "vui lòng nhập lại")
    private Integer maxPeople;
    private RentType rentType;
    private ServiceType serviceType;
    @NotBlank(message = "vui long nhập")
    private String standardRoom;
    @NotBlank(message = "vui long nhập")
    private String descriptionOtherConvenience;
    @Min(value = 0,message = "vui lòng nhập lại")
    private Integer poolArea;
    @Min(value = 0,message = "vui lòng nhập lại")
    private Integer numberOfFloors;

    public ServiceDto() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAreas() {
        return areas;
    }

    public void setAreas(Integer areas) {
        this.areas = areas;
    }

    public Integer getCosts() {
        return costs;
    }

    public void setCosts(Integer costs) {
        this.costs = costs;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Integer getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Integer poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
