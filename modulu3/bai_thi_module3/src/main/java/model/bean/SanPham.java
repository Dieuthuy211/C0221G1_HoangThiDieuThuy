package model.bean;

public class SanPham {
    private int id;
    private String tenSanPham;
    private int gia;
    private int soLuong;
    private String mauSsac;
    private String moTa;
    private int danhMuc;

    public SanPham() {
    }

    public SanPham(int id, String tenSanPham, int gia, int soLuong, String mauSsac, String moTa, int danhMuc) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSsac = mauSsac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public SanPham(String tenSanPham, int gia, int soLuong, String mauSsac, String moTa, int danhMuc) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSsac = mauSsac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSsac() {
        return mauSsac;
    }

    public void setMauSsac(String mauSsac) {
        this.mauSsac = mauSsac;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }
}
