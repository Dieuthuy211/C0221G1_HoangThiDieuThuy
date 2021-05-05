package model;

public class Villa extends Services {
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String DienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String maDichVu, String tenDichVu, String dienTichSuDUng, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, String dienTichHoBoi, String soTang) {
        super(maDichVu, tenDichVu, dienTichSuDUng, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        DienTichHoBoi = dienTichHoBoi;
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

    public String getDienTichHoBoi() {
        return DienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        DienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+"," + tieuChuanPhong +
                "," + tienNghiKhac +
                ", " + DienTichHoBoi +
                "," + soTang;
    }



    @Override
    public void showInFor() {
     toString();
    }
}
