package com.example.model.serviec;

import com.example.model.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProvinceService {
    List<Province> findAll();

}
