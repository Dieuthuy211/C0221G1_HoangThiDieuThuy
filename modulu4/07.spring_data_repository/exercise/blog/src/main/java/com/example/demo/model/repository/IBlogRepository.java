package com.example.demo.model.repository;

import com.example.demo.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value="select * from blog where author like :search order by time_create desc",nativeQuery=true)
    Page<Blog> findAllByAuthorContains(@Param("search") String search, Pageable pageable);
}
