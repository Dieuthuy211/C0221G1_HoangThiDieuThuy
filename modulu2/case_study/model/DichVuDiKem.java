package model;

public class DichVuDiKem {
    private String TenDichVu;
    private String donVi;
    private String giaTien;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String tenDichVu, String donVi, String giaTien) {
        TenDichVu = tenDichVu;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        TenDichVu = tenDichVu;
    }

    @Override
    public String toString() {
        return TenDichVu + "," +
                 donVi + "," +
                 giaTien ;
    }
}
