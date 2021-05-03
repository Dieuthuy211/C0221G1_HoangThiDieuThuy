package models;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private String namSanXuat;
    private String chuSohuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSohuu = chuSohuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSohuu() {
        return chuSohuu;
    }

    public void setChuSohuu(String chuSohuu) {
        this.chuSohuu = chuSohuu;
    }

    @Override
    public String toString() {
        return
                bienKiemSoat + "," +
                tenHangSanXuat + "," +
                namSanXuat +"," +
                chuSohuu;
    }

    public abstract void showInFor();
}
