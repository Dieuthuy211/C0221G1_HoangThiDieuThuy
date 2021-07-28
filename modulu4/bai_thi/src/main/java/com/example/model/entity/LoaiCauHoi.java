package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiCauHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenLoaiCauHoi;
    @OneToMany(mappedBy = "loaiCauHoi")
    List<CauHoi> cauHois;

    public LoaiCauHoi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenLoaiCauHoi() {
        return tenLoaiCauHoi;
    }

    public void setTenLoaiCauHoi(String tenLoaiCauHoi) {
        this.tenLoaiCauHoi = tenLoaiCauHoi;
    }

    public List<CauHoi> getCauHois() {
        return cauHois;
    }

    public void setCauHois(List<CauHoi> cauHois) {
        this.cauHois = cauHois;
    }
}
