package models;

public class DanhBa {
    private String hoTen;
    private  String soDienThoai;
    private String diachi;
    private  String email;
    private String nhom;
    private String ngaySing;
    private String goiTinh;

    public DanhBa() {
    }

    public DanhBa(String hoTen, String soDienThoai, String diachi, String email, String nhom, String ngaySing, String goiTinh) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diachi = diachi;
        this.email = email;
        this.nhom = nhom;
        this.ngaySing = ngaySing;
        this.goiTinh = goiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(String ngaySing) {
        this.ngaySing = ngaySing;
    }

    public String getGoiTinh() {
        return goiTinh;
    }

    public void setGoiTinh(String goiTinh) {
        this.goiTinh = goiTinh;
    }

    @Override
    public String toString() {
        return
                hoTen +
                "," + soDienThoai +
                "," + diachi +
                "," + email +
                "," + nhom +
                "," + ngaySing +
                "," + goiTinh
                ;
    }
}
