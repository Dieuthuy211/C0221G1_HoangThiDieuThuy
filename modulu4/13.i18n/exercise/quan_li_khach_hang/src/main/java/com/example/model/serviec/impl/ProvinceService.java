package com.example.model.serviec.impl;


import com.example.model.entity.Province;
import com.example.model.repository.IProvinceRepository;
import com.example.model.serviec.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
