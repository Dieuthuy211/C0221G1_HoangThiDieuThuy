package com.example.model.repository.customer_user_service;

import com.example.model.entity.customer_user_service.CustomerUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerUserServiceRepository extends JpaRepository<CustomerUserService,Integer>{
    @Query(value="select contract_end_date" +
            "FROM contract\n" +
            "where contract_end_date>=now()",nativeQuery=true)
    Page<CustomerUserService> findByCustomerContaining(Pageable pageable);
}
