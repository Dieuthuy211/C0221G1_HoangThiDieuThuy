package com.example.model.entity.customer_user_service;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract_detail.AttachService;
import com.example.model.entity.contract_detail.ContractDetail;
import com.example.model.entity.customer.Customer;

import javax.persistence.*;

@Entity
public class CustomerUserService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "contract_id",referencedColumnName = "id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "contract_detail_id",referencedColumnName = "id")
    private ContractDetail contractDetail;
    @ManyToOne
    @JoinColumn(name = "attach_ervice_id",referencedColumnName = "id")
    private AttachService  attachService;

    public CustomerUserService() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ContractDetail getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(ContractDetail contractDetail) {
        this.contractDetail = contractDetail;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
