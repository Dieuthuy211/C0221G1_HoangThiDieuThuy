package controllers;

import commons.DocGhiFile;
import commons.DocGhiFileStudy;
import models.Oto;
import models.PhuongTien;
import models.XeMay;
import models.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNangDanhMuc {
    static Scanner scanner = new Scanner(System.in);

    public static void themPhuongTien() {
        System.out.println("Menu thêm Phương Tiện :\n" +
                "1.thêm Oto\n" +
                "2.thêm xe máy\n" +
                "3.thêm xe tải\n" +
                "4.quay lại menu chính\n" +
                "5.thoát");
        System.out.println("nhập danh mục chọn");
        String chon = scanner.nextLine();
        switch (chon) {
            case "1":
                themOto();
                break;
            case "2":
                themXeMay();
                break;
            case "3":
                themXeTai();
                break;
            case "4":
                DanhMucPhuongTien.danhMuc();
                break;
            case "5":
                System.exit(0);
        }
    }

    public static void themXeTai() {
        //String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu, String trongTai
        String bienKiemSoat = QuanLyNhapDuLIeu.nhapBienXeTai();
        String hang = QuanLyNhapDuLIeu.nhapHang();
        String nam = QuanLyNhapDuLIeu.nhapNamSanXuat();
        String ten = QuanLyNhapDuLIeu.nhapten();
        String taitrong = QuanLyNhapDuLIeu.nhapTrongTai();
        PhuongTien xeTai = new XeTai(bienKiemSoat, hang, nam, ten, taitrong);
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList.add(xeTai);
        DocGhiFile.ghiFilePT(phuongTienList, true);
    }

    public static void themXeMay() {
//String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu, String congSuat
        String bienKiemSoat = QuanLyNhapDuLIeu.nhapBienXeMay();
        String hang = QuanLyNhapDuLIeu.nhapHang();
        String nam = QuanLyNhapDuLIeu.nhapNamSanXuat();
        String ten = QuanLyNhapDuLIeu.nhapten();
        String congSuat = QuanLyNhapDuLIeu.nhapCongSuat();
        PhuongTien xeMay = new XeMay(bienKiemSoat, hang, nam, ten, congSuat);
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList.add(xeMay);
       DocGhiFile.ghiFilePT(phuongTienList, true);
    }

    public static void themOto() {
//        String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu, String soChoNgoi, String kieuXa
        String bienKiemSoat = QuanLyNhapDuLIeu.nhapBienOto();
        String hang = QuanLyNhapDuLIeu.nhapHang();
        String nam = QuanLyNhapDuLIeu.nhapNamSanXuat();
        String ten = QuanLyNhapDuLIeu.nhapten();
        String soghe = QuanLyNhapDuLIeu.nhapSoghe();
        String kieuXe = QuanLyNhapDuLIeu.nhapKieuXe();
        PhuongTien oTo = new Oto(bienKiemSoat, hang, nam, ten, soghe, kieuXe);
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList.add(oTo);
        DocGhiFile.ghiFilePT(phuongTienList, true);
    }


    public static void hienThi() {
        while (true) {
            System.out.println("Menu hiển thị :\n" +
                    "1.hiển thị xe tải\n" +
                    "2.hiển thị xe máy\n" +
                    "3.hiển thị xe oto\n" +
                    "4.hiển thị tất cả\n" +
                    "5.quay lại Menu chính\n" +
                    "6.thoát");
            System.out.println("nhập danh mục lựa chọn");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    hienThiXeTai();
                    break;
                case "2":
                    hienThiXeMay();
                    break;
                case "3":
                    hienThiOto();
                    break;
                case "4":
                    hienThiTatCa();
                    break;
                case "5":
                    DanhMucPhuongTien.danhMuc();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("nhập sai!!vui lòng nhập lại");

            }
        }
    }

    public static void hienThiTatCa() {
        List<PhuongTien> phuongTienList = DocGhiFile.docFilePT();
        for (PhuongTien phuongTien : phuongTienList) {
            System.out.println(phuongTien);
        }
    }

    public static void hienThiOto() {
        List<PhuongTien> phuongTienList = DocGhiFile.docFilePT();

        for (PhuongTien phuongTien : phuongTienList) {
            if (phuongTien instanceof Oto) {
                System.out.println(phuongTienList);
            }
        }
    }

    public static void hienThiXeMay() {
        List<PhuongTien> phuongTienList = DocGhiFile.docFilePT();
        for (PhuongTien phuongTien : phuongTienList) {
            if (phuongTien instanceof XeMay) {
                System.out.println(phuongTien);
            }
        }
    }

    public static void hienThiXeTai() {
        List<PhuongTien> phuongTienList = DocGhiFile.docFilePT();
        for (PhuongTien phuongTien : phuongTienList) {
            if (phuongTien instanceof XeTai) {
                System.out.println(phuongTien);
            }
        }
    }


    public static void xoa() {
        List<PhuongTien> phuongTienList = DocGhiFile.docFilePT();
        boolean kiemtra=false;
       while (true){
           for (int i = 0; i < phuongTienList.size(); i++) {
               System.out.println((i+1) +"."+phuongTienList.get(i));
           }
           System.out.println("nhập vị trí bạn muốn xóa");
           String nhap=scanner.nextLine();
           for (int i=0;i<phuongTienList.size();i++){
               if(Integer.parseInt(nhap)==i){
                   System.out.println("bạn có muốn xóa không :\n" +
                           "1.có\n" +
                           "2.không");
                   String chon=scanner.nextLine();
                   switch (chon){
                       case "1":
                           phuongTienList.remove(i);
                           kiemtra=true;
                           break;
                       case "2":
                           DanhMucPhuongTien.danhMuc();
                       default:
                           System.out.println("vui lòng nhập đúng lựa chọn");

                   }
               }
           }
           if(kiemtra){
               break;
           }else {
               System.out.println("vui lòng nhập lại");
           }
       }
       DocGhiFile.ghiFilePT(phuongTienList,true);
    }
}
