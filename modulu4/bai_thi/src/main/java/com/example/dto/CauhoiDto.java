package com.example.dto;

import com.example.model.entity.LoaiCauHoi;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;


public class CauhoiDto {
    private Integer id;

    @Size(min = 5,max = 100,message = "vui lòng nhập thêm")
    private String tieuDe;
    @Size(min = 10,max = 500,message = "vui lòng nhập thêm")
    private String noiDung;
    LoaiCauHoi loaiCauHoi;
    private String ngayTao = LocalDate.now().toString();
    private String tinhTrang;
    private boolean flag =false;

    public CauhoiDto() {
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
