package com.example.model.service.impl;

import com.example.model.entity.LoaiCauHoi;
import com.example.model.repository.LoaiCauHoiRepository;
import com.example.model.service.ILoaiCauHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiCauHoiService implements ILoaiCauHoiService {
    @Autowired
    LoaiCauHoiRepository loaiCauHoiRepository;
    @Override
    public List<LoaiCauHoi> findAll() {
        return loaiCauHoiRepository.findAll();
    }

    @Override
    public LoaiCauHoi findById(Integer id) {
        return null;
    }

    @Override
    public void save(LoaiCauHoi loaiCauHoi) {

    }

    @Override
    public void remove(Integer id) {

    }
}
