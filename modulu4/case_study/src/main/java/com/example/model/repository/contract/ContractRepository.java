package com.example.model.repository.contract;

import com.example.model.entity.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer> {
}
