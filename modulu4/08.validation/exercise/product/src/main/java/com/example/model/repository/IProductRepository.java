package com.example.model.repository;

import com.example.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
    @Query(value="select * from product where name like :search ",nativeQuery=true)
    Page<Product> findAllByNameContaining(@Param("search") String search, Pageable pageable);
}
