package models;

public class XeTai extends PhuongTien {
    private String trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu, String trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSohuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+","+ trongTai;
    }

    @Override
    public void showInFor() {
        toString();
    }
}
