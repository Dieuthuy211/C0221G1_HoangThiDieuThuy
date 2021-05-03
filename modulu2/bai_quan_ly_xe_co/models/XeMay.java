package models;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSohuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + ","+ congSuat;
    }

    @Override
    public void showInFor() {
        toString();
    }
}
