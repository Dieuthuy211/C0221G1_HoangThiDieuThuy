package com.example.model.repository.contract;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value="select * from contract  left join customer on customer.id=contract.customer_id where customer.name like %?%  and contract_end_date>=now()",nativeQuery=true)
    Page<Contract> findByCustomerNameContaining(String search, Pageable pageable);
}
