package bai_tap.luu_file_nhi_phan;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String maSP;
    private  String tenSP;
    private String hangSP;
    private String gia;
    private String moTaKhac;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String hangSP, String gia, String moTaKhac) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSP = hangSP;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSP() {
        return hangSP;
    }

    public void setHangSP(String hangSP) {
        this.hangSP = hangSP;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", hangSP='" + hangSP + '\'' +
                ", gia='" + gia + '\'' +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';
    }
}
