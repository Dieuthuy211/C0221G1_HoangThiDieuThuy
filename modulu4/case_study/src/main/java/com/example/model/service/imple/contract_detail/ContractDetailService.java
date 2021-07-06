package com.example.model.service.imple.contract_detail;

import com.example.model.entity.contract_detail.ContractDetail;
import com.example.model.repository.contract_detail.ContractDetailRepository;
import com.example.model.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public ContractDetail findById(Integer id) {
        return null;
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void remove(Integer id) {

    }
}
