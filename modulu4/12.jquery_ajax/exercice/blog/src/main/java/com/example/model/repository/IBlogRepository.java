package com.example.model.repository;


import com.example.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value="select * from blog where author like :search",nativeQuery=true)
    Page<Blog> findAllByAuthorContains(@Param("search") String search, Pageable pageable);

}
