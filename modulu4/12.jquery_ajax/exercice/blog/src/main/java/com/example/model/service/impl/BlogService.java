package com.example.model.service.impl;


import com.example.model.entity.Blog;
import com.example.model.repository.IBlogRepository;
import com.example.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;


    @Override
    public Page<Blog> findAllByAuthorContains(String search, Pageable pageable) {
        return blogRepository.findAllByAuthorContains("%"+search+"%",pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return null;
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
