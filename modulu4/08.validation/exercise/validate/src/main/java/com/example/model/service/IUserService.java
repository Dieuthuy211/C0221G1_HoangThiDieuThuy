package com.example.model.service;

import com.example.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    Page<User> findAll(Pageable pageable);
    User findById(Integer id);

    void save(User user);


    void remove(Integer id);
}
