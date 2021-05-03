package models;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + bac;
    }

    @Override
    public void showInFor() {
        toString();
    }
}
