package com.example.model.service.impl;

import com.example.model.entity.Producer;
import com.example.model.entity.Product;
import com.example.model.repository.IProducerRepository;
import com.example.model.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService implements IProducerService {
    @Autowired
    IProducerRepository producerRepository;


    @Override
    public List<Producer> findAll() {
        return producerRepository.findAll();
    }

    @Override
    public Page<Producer> findAll(Pageable pageable) {
        return producerRepository.findAll(pageable);
    }

    @Override
    public Producer findById(Integer id) {
        return producerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Producer producer) {
        producerRepository.save(producer);
    }

    @Override
    public void remove(Integer id) {
        producerRepository.deleteById(id);
    }
}
