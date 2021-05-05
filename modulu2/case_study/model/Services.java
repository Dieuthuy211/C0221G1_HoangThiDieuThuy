package model;

public abstract class Services {
    private String maDichVu;
    private String tenDichVu;
    private String DienTichSuDUng;
    private String chiPhiThue;
    private String soNguoiToiDa;
    private String kieuThue;

    public Services() {
    }

    public Services(String maDichVu, String tenDichVu, String dienTichSuDUng, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        DienTichSuDUng = dienTichSuDUng;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDUng() {
        return DienTichSuDUng;
    }

    public void setDienTichSuDUng(String dienTichSuDUng) {
        DienTichSuDUng = dienTichSuDUng;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(String soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return
               maDichVu + "," +
                 tenDichVu + "," +
                 DienTichSuDUng + "," +
                       chiPhiThue + "," +
                soNguoiToiDa + "," +
                kieuThue ;
    }



    public abstract void showInFor();
}
