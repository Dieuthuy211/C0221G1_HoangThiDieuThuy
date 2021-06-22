package com.example.demo.model.repository;

import com.example.demo.model.entity.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();

        Blog findById(long id);

    void save(Blog t);

    void remove(long id);
}
