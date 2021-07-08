package com.example.model.service;

import com.example.model.entity.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService extends IGeneralService<Contract>{
    Page<Contract> findByCustomerNameContaining(String search, Pageable pageable);
}
