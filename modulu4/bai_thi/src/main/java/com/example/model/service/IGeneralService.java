package com.example.model.service;

import java.util.List;

public interface IGeneralService<T> {
   List<T> findAll();

    T findById(Integer id);

    void save(T t);

    void remove(Integer id);
}
