package model;

public class Room extends Services {
   private DichVuDiKem dichVuDiKem;

    public Room() {
    }

    public Room(String maDichVu, String tenDichVu, String dienTichSuDUng, String chiPhiThue, String soNguoiToiDa, String kieuThue, DichVuDiKem dichVuDiKem) {
        super(maDichVu, tenDichVu, dienTichSuDUng, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return super.toString()+","+ dichVuDiKem.toString();
    }

    @Override
    public void showInFor() {
        toString();
    }
}
