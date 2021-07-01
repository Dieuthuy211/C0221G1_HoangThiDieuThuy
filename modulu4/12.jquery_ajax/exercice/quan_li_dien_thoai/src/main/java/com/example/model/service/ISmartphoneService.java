package com.example.model.service;

import com.example.model.entity.Smartphone;
import org.springframework.stereotype.Service;

import java.util.Optional;




public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}