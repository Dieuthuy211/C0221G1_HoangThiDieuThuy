package com.example.model.service;

import com.example.model.entity.Producer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProducerService {
//    Page<Producer> findAllByNameContains(String name, Pageable pageable);
    List<Producer> findAll();
    Page<Producer> findAll(Pageable pageable);
    Producer findById(Integer id);

    void save(Producer producer);

    void remove(Integer id);
}
