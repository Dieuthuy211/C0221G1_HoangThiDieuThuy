package model.khachHang;

public class VietNam extends KhachHang {
    private String loaiKhachHang;
    private double dinhMucTieuThu;

    public VietNam() {
    }

    public VietNam(String loaiKhachHang, double dinhMucTieuThu) {
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public VietNam(String maKhachHang, String hoTen, String loaiKhachHang, double dinhMucTieuThu) {
        super(maKhachHang, hoTen);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(double dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + loaiKhachHang +
                ","+ dinhMucTieuThu ;
    }


    @Override
    public String showInFor() {
        return "maKhachHang='" + super.getMaKhachHang() + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", dinhMucTieuThu='" + dinhMucTieuThu;
    }
}
