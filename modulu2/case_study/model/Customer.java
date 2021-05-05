package model;

//Customer:khách hàng
public class Customer {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cmnn;
    private String soDienThoai;
    private String email;
    private String loaiKhach;
    private String diaChi;


    public Customer() {
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cmnn, String soDienThoai, String email, String loaiKhach, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnn = cmnn;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnn() {
        return cmnn;
    }

    public void setCmnn(String cmnn) {
        this.cmnn = cmnn;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    @Override
    public String toString() {
        return
                hoTen +
                "," + ngaySinh +
                "," + gioiTinh +
                "," + cmnn +
                "," + soDienThoai +
                "," + email +
                "," + loaiKhach +
                "," + diaChi;
    }
}
