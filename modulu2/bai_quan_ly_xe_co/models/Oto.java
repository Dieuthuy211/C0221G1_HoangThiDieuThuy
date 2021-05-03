package models;

public class Oto extends PhuongTien {
    private String soChoNgoi;
    private String kieuXa;

    public Oto() {
    }
    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu, String soChoNgoi, String kieuXa) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSohuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXa = kieuXa;
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXa() {
        return kieuXa;
    }

    public void setKieuXa(String kieuXa) {
        this.kieuXa = kieuXa;
    }

    @Override
    public String toString() {
        return super.toString()+","+ soChoNgoi +"," + kieuXa ;
    }

    @Override
    public void showInFor() {
        toString();
    }
}
