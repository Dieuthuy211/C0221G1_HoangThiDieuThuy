package com.example.model.repository;

import com.example.model.entity.CauHoi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CauHoiRepository extends JpaRepository<CauHoi,Integer> {
    @Query(value="select * from cau_hoi  where cau_hoi.tieu_de like %?% and loai_cau_hoi_id like %?% and flag=0",nativeQuery=true)
    Page<CauHoi> findByTieuDeContaining(String tieuDe, String loaiCauHoi, Pageable pageable);
}
