package com.example.model.entity.contract_detail;



import com.example.model.entity.customer_user_service.CustomerUserService;

import javax.persistence.*;
import java.util.List;

@Entity(name = "attach_service")
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer cost;
    private String status;
    @OneToMany(mappedBy = "attachService")
    List<ContractDetail> contractDetails;
    @OneToMany(mappedBy = "attachService")
    private List<CustomerUserService> customerUserServices;

    public AttachService() {
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

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
