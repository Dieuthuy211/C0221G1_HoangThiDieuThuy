package com.example.model.repository.customer;
import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value="select * from customer where name like %?% and flag=0",nativeQuery=true)
Page<Customer> findByNameContaining(String search, Pageable pageable);

}
