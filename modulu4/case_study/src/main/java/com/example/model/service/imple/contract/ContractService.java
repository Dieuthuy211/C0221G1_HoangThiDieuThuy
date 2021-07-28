package com.example.model.service.imple.contract;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract_detail.ContractDetail;
import com.example.model.repository.contract.ContractRepository;
import com.example.model.service.IContractDetailService;
import com.example.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    ContractRepository contractRepository;
    @Autowired
    IContractDetailService contractDetailService;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Contract findById(Integer id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        List<ContractDetail> contractDetails = contractDetailService.findAll();
        for(ContractDetail contractDetail:contractDetails){
            if(contractDetail.getContract().getId()==contract.getId()){
                contract.setTotal(contract.getTotal() + (contractDetail.getAttachService().getCost()*contractDetail.getQuantity()));
            }
            contractRepository.save(contract);
        }

    }

    @Override
    public void remove(Integer id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Page<Contract> findByCustomerNameContaining(String search, Pageable pageable) {
        return contractRepository.findByCustomerNameContaining(search,pageable);
    }
}
