package com.example.demo.model.serviec.impl;

import com.example.demo.model.entity.Province;
import com.example.demo.model.repository.IProvinceRepository;
import com.example.demo.model.serviec.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    IProvinceRepository provinceRepository;


    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }
}
