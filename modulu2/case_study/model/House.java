package model;

public class House extends Services {
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String soTang;

    public House() {
    }

    public House(String maDichVu, String tenDichVu, String dienTichSuDUng, String chiPhiThuê, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, String soTang) {
        super(maDichVu, tenDichVu, dienTichSuDUng, chiPhiThuê, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+","+ tieuChuanPhong +
                "," + tienNghiKhac +
                ", " + soTang;
    }

    @Override
    public void showInFor() {
        toString();
    }
}
