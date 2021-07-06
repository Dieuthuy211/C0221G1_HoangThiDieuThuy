package com.example.model.repository.customer_user_service;

import com.example.model.entity.customer_user_service.CustomerUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerUserServiceRepository extends JpaRepository<CustomerUserService,Integer>{
    @Query(value="select* from customer_user_service left join customer on  customer.id=customer_user_service.customer_id left join contract on contract.id=customer_user_service.contract_id left join contract_detail on contract_detail.id=customer_user_service.contract_detail_id left join attach_service on attach_service.id=customer_user_service.attach_ervice_id where contract_end_date>=now() group by customer_user_service.contract_id;",nativeQuery=true)
    Page<CustomerUserService> findByCustomerContaining(Pageable pageable);
}
