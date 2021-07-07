package com.example.model.repository.employee;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value="select * from employee where name like %?% and flag=0",nativeQuery=true)
    Page<Employee> findByNameContaining(String search, Pageable pageable);
}
