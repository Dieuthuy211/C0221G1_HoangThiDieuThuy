package com.example.model.entity.contract_detail;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer_user_service.CustomerUserService;


import javax.persistence.*;
import java.util.List;

@Entity(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "contract_id",referencedColumnName = "id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "attach_Service_id",referencedColumnName = "id")
    private AttachService attachService;
    private Integer quantity;
    @OneToMany(mappedBy = "contractDetail")
    private List<CustomerUserService> customerUserServices;

    public ContractDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
