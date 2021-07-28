package com.example.model.service;

import com.example.model.entity.CauHoi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICauHoiService extends IGeneralService<CauHoi> {
    Page<CauHoi> findByTieuDeContaining(String tieuDe, String loaiCauHoi, Pageable pageable);
}
