package com.example.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class CauHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tieuDe;
    private String noiDung;
    @ManyToOne
    @JoinColumn(name = "loai_cau_hoi_id",referencedColumnName = "id")
    LoaiCauHoi loaiCauHoi;
    @Column(columnDefinition = "date")
    private String ngayTao = LocalDate.now().toString();
    private String tinhTrang;
    private boolean flag =false;

    public CauHoi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public LoaiCauHoi getLoaiCauHoi() {
        return loaiCauHoi;
    }

    public void setLoaiCauHoi(LoaiCauHoi loaiCauHoi) {
        this.loaiCauHoi = loaiCauHoi;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
