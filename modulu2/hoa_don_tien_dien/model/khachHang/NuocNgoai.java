package model.khachHang;

public class NuocNgoai extends KhachHang {
    private String quocTich;

    public NuocNgoai() {
    }

    public NuocNgoai(String maKhachHang, String hoTen, String quocTich) {
        super(maKhachHang, hoTen);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + quocTich ;
    }



    @Override
    public String showInFor() {
        return "maKhachHang='" + super.getMaKhachHang() + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                "quocTich='" + quocTich;
    }
}
