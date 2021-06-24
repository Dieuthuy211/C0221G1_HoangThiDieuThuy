package com.example.demo.model.serviec;

import com.example.demo.model.entity.Customer;
import com.example.demo.model.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProvinceService {
    List<Province> findAll();
    Province findById(Integer id);

    void save(Province province);

    void remove(Integer id);
    Page<Province> findAll(Pageable pageable);
    Page<Province> findAllBytNameContaining(String name, Pageable pageable);
}
