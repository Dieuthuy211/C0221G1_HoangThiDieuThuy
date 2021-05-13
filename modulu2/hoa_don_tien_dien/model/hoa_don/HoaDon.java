package model.hoa_don;

public class HoaDon {
    private String maHoaDon;
    private String maKhachHang;
    private String ngayRaHoaDon;
    private double soluong;
    private double donGia;
    private double thanhTien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKhachHang, String ngayRaHoaDon, double soluong, double donGia, double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soluong = soluong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public double getDoGia() {
        return donGia;
    }

    public void setDoGia(double doGia) {
        this.donGia = doGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return
                 maHoaDon +
                "," + maKhachHang +
                "," + ngayRaHoaDon +
                "," + soluong +
                "," + donGia +
                "," + thanhTien;
    }


}
