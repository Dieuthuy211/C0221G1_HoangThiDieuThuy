package controllers;

import commons.GhiDocFile;
import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);
    public static void themCanBo(){
        do {
            System.out.println("Menu thêm Cán bộ :\n" +
                    "1.thêm công nhân\n" +
                    "2.thêm kỹ sư\n" +
                    "3.thêm nhân viên\n" +
                    "4.quay lại menu chính\n" +
                    "5.thoát");
            System.out.println("nhập lựa chọn bạn muốn");
            String num=scanner.nextLine();
            switch (num){
                case "1":
                    themCongNhan();
                    break;
                case "2":
                    themKySu();
                    break;
                case "3":
                    themNhanVien();
                    break;
                case "4":
                  DanhMucPhuongTien.quanLi();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("nhập sai!!!vui lòng nhập lại");
            }
        }while (true);
    }

    public static void themNhanVien() {
        //tring hoTen, String namSinh, String gioiTinh, String diaChi, String congViec
        String ten=QuanLyNhapDuLieu.nhapTen();
        String namSinh=QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh=QuanLyNhapDuLieu.nhapGioiTinh();
        String diachi=QuanLyNhapDuLieu.nhapDiaChi();
        String congViec=QuanLyNhapDuLieu.nhapCongViec();

        List<CanBo> listCanBo=new ArrayList<>();
        CanBo nhanVien=new NhanVien(ten,namSinh,gioiTinh,diachi,congViec);
        listCanBo.add(nhanVien);
        GhiDocFile.ghifile(listCanBo,true);
    }
    public static void themKySu() {
        String ten=QuanLyNhapDuLieu.nhapTen();
        String namSinh=QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh=QuanLyNhapDuLieu.nhapGioiTinh();
        String diachi=QuanLyNhapDuLieu.nhapDiaChi();
        String nganhDaoTao=QuanLyNhapDuLieu.nhapNganhDaoTao();

        List<CanBo> listCanBo=new ArrayList<>();
        CanBo kySu=new KySu(ten,namSinh,gioiTinh,diachi,nganhDaoTao);
        listCanBo.add(kySu);
        GhiDocFile.ghifile(listCanBo,true);
    }
    public static void themCongNhan() {
        String ten=QuanLyNhapDuLieu.nhapTen();
        String namSinh=QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh=QuanLyNhapDuLieu.nhapGioiTinh();
        String diachi=QuanLyNhapDuLieu.nhapDiaChi();
        String bac=QuanLyNhapDuLieu.nhapBac();

        List<CanBo> listCanBo=new ArrayList<>();
        CanBo congNhan =new CongNhan(ten,namSinh,gioiTinh,diachi,bac);
        listCanBo.add(congNhan);
        GhiDocFile.ghifile(listCanBo,true);
    }

    public static void hienthi(){
       do {
           System.out.println("Menu hiển thị Cán Bộ\n" +
                   "1.hiển thị công nhân\n" +
                   "2.hiển thị kỹ sư\n" +
                   "3.hiển thị nhân viên\n" +
                   "4.hiển thị tất cả\n" +
                   "5.quay lai menu chính\n" +
                   "6.thoát");
           System.out.println("mời nhập lựa chọn");
           String num=scanner.nextLine();
           switch (num){
               case "1":
                   hienThiCongNhan();
                   break;
               case "2":
                   hienThiKySu();
                   break;
               case "3":
                   hienThiNhanVien();
                   break;
               case "4":
                   hienThiTatCa();
                   break;
               case "5":
                   DanhMucPhuongTien.quanLi();
                   break;
               case "6":
                   System.exit(0);
               default:
                   System.out.println("nhập sai!!! vui nhập lại");
           }
       }while (true);
    }

    public static void hienThiTatCa() {
        List<CanBo> listCanBo=GhiDocFile.docFile();
        for (CanBo canBo:listCanBo){
            System.out.println(canBo);
        }
    }
    public static void hienThiNhanVien() {
        List<CanBo> listCanBo=GhiDocFile.docFile();
        for (CanBo canBo:listCanBo){
            if(canBo instanceof NhanVien){
                System.out.println(canBo);
            }
        }

    }
    public static void hienThiKySu() {
        List<CanBo> listCanBo=GhiDocFile.docFile();
        for (CanBo canBo:listCanBo){
            if(canBo instanceof KySu){
                System.out.println(canBo);
            }
        }
    }
    public static void hienThiCongNhan() {
        List<CanBo> listCanBo=GhiDocFile.docFile();
        for (CanBo canBo:listCanBo){
            if(canBo instanceof CongNhan){
                System.out.println(canBo);
            }
        }
    }

    public static void timKiem(){
        System.out.println("nhập tên cần tìm");
        String ten=scanner.nextLine();
        List<CanBo> canBoList=GhiDocFile.docFile();
        for (CanBo canBo:canBoList){
            if(canBo.getHoTen().contains(ten)){
                System.out.println(canBo);

            }
        }

    }
    public static  void sapXep(){
        List<CanBo> list=GhiDocFile.docFile();
        list.sort(Comparator.comparing(CanBo::getHoTen));
        for (CanBo canBo:list){
            System.out.println(canBo);
        }
    }
    public static void xoa(){
        List<CanBo> list=GhiDocFile.docFile();
        boolean kiemTra=false;
        while (true){
            for (int i=0;i<list.size();i++){
                System.out.println((i+1)+" : "+list.get(i));
            }
            System.out.println("chọn mục muốn xóa");
            String chon=scanner.nextLine();
            for (int i=0;i<list.size();i++) {
                if ((Integer.parseInt(chon) - 1) == i) {
                    System.out.println("bạn có muốn xóa không :\n" +
                            "1.có\n" +
                            "2.không");
                    String chon1=scanner.nextLine();
                    switch (chon1){
                        case "1":
                            list.remove(i);
                            kiemTra=true;
                            break;
                        case "2":
                            return;
                        default:
                            System.out.println("vui lòng chọn 1 or 2");
                    }

                }
            }
            if(kiemTra){
                break;
            }else {
                System.out.println("nhập sai!!!nhập lại....");
            }
        }
        GhiDocFile.ghifile(list,false);
    }
}
