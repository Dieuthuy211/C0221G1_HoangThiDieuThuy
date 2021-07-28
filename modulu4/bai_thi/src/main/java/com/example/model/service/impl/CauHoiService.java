package com.example.model.service.impl;

import com.example.model.entity.CauHoi;
import com.example.model.repository.CauHoiRepository;
import com.example.model.service.ICauHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauHoiService implements ICauHoiService {
    @Autowired
    CauHoiRepository cauHoiRepository;

    @Override
    public List<CauHoi> findAll() {
        return cauHoiRepository.findAll();
    }

    @Override
    public CauHoi findById(Integer id) {
        return cauHoiRepository.findById(id).orElse(null);
    }

    @Override
    public void save(CauHoi cauHoi) {

        cauHoiRepository.save(cauHoi);
    }

    @Override
    public void remove(Integer id) {

    }


    @Override
    public Page<CauHoi> findByTieuDeContaining(String tieuDe, String loaiCauHoi, Pageable pageable) {
        return cauHoiRepository.findByTieuDeContaining(tieuDe,loaiCauHoi,pageable);
    }
}
