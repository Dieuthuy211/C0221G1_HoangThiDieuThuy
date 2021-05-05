package model;

public class Employee {
    private String tenNV;
    private String ngaySinh;
    private String diaChi;

    public Employee() {
    }

    public Employee( String tenNV, String ngaySinh, String diaChi) {

        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return tenNV +
                "," + ngaySinh +
                "," + diaChi;
    }
}
