package controllers;

import commons.DingDangNHap;
import commons.DocGhiFIleQuanLyTienDien;
import model.hoa_don.HoaDon;
import model.khachHang.KhachHang;
import model.khachHang.NuocNgoai;
import model.khachHang.VietNam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacChucNang {
    static Scanner scanner = new Scanner(System.in);

    public static void themMoiKhachHang() {
        String chon;
      while (true){
          System.out.println("1.thêm khách hang Việt Nam\n" +
                  "2.thêm khách hàng Nước Ngoài\n" +
                  "3.quay về menu chính\n" +
                  "4.thoát");
          chon = scanner.nextLine();
          switch (chon) {
              case "1":
                  themVietNam();
                  break;
              case "2":
                  themNuocNgoai();
                  break;
              case "3":
                  QuanLyHoaDonTienDien.disPlayMenu();
                  break;
              case "4":
                  System.exit(0);
              default:
                  System.err.println("nhập sai vui lòng nhập lại");
          }
      }
    }
    private static void themNuocNgoai() {
        String maKH=NhapDuLieuHoaDon.nhapMakhachNN();
        String ten=NhapDuLieuHoaDon.nhapTenNN();
        String quocTich=NhapDuLieuHoaDon.nhapQuocTich();
        KhachHang nuocNgoai=new NuocNgoai(maKH,ten,quocTich);
        List<KhachHang> list=new ArrayList<>();
        list.add(nuocNgoai);
        File file=new File("hoa_don_tien_dien/data/khachHang.csv");
        DocGhiFIleQuanLyTienDien.ghiKhachHang(list,file,true);
    }
    private static void themVietNam() {
// String maKhachHang, String hoTen, String loaiKhachHang, String dinhMucTieuThu
        String maKhachHang = NhapDuLieuHoaDon.nhapMakhachVN();
        String ten = NhapDuLieuHoaDon.nhapTenVN();
        String loaiKhach = NhapDuLieuHoaDon.nhaploaiKhach();
        double dinhMuc = NhapDuLieuHoaDon.nhapDinhMucTieuThu();
        KhachHang vietNam = new VietNam(maKhachHang, ten, loaiKhach, dinhMuc);
        List<KhachHang> list = new ArrayList<>();
        list.add(vietNam);
        File file = new File("hoa_don_tien_dien/data/khachHang.csv");
        DocGhiFIleQuanLyTienDien.ghiKhachHang(list, file, true);
    }




    public static void hienThiKhachHang(){
        String chon;
       while (true){
           System.out.println("1.hien thi hang Viet Nam\n" +
                   "2.hien thị khach hang nước ngoài\n" +
                   "3.hiển thị tất cả\n" +
                   "4.quay lại menu chính\n" +
                   "5.thoát");
           chon=scanner.nextLine();
           switch (chon){
               case "1":
                   hienThiVietNam();
                   break;
               case "2":
                   hienThiNuocNgoai();
                   break;
               case "3":
                   hienThiTatCa();
               case "4":
                   QuanLyHoaDonTienDien.disPlayMenu();
                   break;
               case "5":
                   System.exit(0);
               default:
                   System.err.println("nhập sai vui long nhập lại");
           }
       }

    }
   private static void hienThiTatCa() {
        List<KhachHang> list=DocGhiFIleQuanLyTienDien.docKhachHang();
        for (KhachHang khachHang:list){
            System.out.println(khachHang.showInFor());
        }
    }
   private static void hienThiNuocNgoai() {
        List<KhachHang> list=DocGhiFIleQuanLyTienDien.docKhachHang();
        for (KhachHang khachHang:list){
            if(khachHang instanceof NuocNgoai){
                System.out.println(khachHang.showInFor());
            }
        }
    }
   private static void hienThiVietNam() {
        List<KhachHang> list=DocGhiFIleQuanLyTienDien.docKhachHang();
        for (KhachHang khachHang:list){
            if(khachHang instanceof VietNam){
                System.out.println(khachHang.showInFor());
            }
        }
    }


    public static void timKiem() {
        List<KhachHang> list=DocGhiFIleQuanLyTienDien.docKhachHang();
        System.out.println("nhâp ten cần tìm");
        String ten=scanner.nextLine();
        for(KhachHang khachHang:list){
            if(khachHang.getHoTen().contains(ten)){
                System.out.println(khachHang.showInFor());
            }
        }

    }


    public static void themHoaDon(){
//    String maHoaDon, String maKhachHang, String ngayRaHoaDon, double soluong, double doGia, double thanhTien
        String maHoaDon=NhapDuLieuHoaDon.nhapMaHoaDon();
        String maKhachHang=NhapDuLieuHoaDon.nhapMaKhangHoaDon();
        String ngayRaHoaDon=NhapDuLieuHoaDon.nhapNgayRaHoaDon();
        double soLuong=NhapDuLieuHoaDon.nhapSoLuong();
        double donGia=NhapDuLieuHoaDon.nhapDonGia();
        double thanhTien=NhapDuLieuHoaDon.nhapThanhtien();
        HoaDon hoaDon=new HoaDon(maHoaDon,maKhachHang,ngayRaHoaDon,soLuong,donGia,thanhTien);
        List<HoaDon> hoaDonList=new ArrayList<>();
        hoaDonList.add(hoaDon);
        File file=new File("hoa_don_tien_dien/data/hoaDon.csv");
        DocGhiFIleQuanLyTienDien.ghiHoaDon(hoaDonList,file,true);
    }

    public static void hienThiHoaDon(){
       List<HoaDon>hoaDonList=DocGhiFIleQuanLyTienDien.docHoaDon();
       for (HoaDon hoaDon:hoaDonList){
           System.out.println(hoaDon.toString());
       }
    }

    public static void suaHoaDon(){
        //    String maHoaDon, String maKhachHang, String ngayRaHoaDon, double soluong, double doGia, double thanhTien
        List<HoaDon> hoaDonList=DocGhiFIleQuanLyTienDien.docHoaDon();
        for(int i=0;i<hoaDonList.size();i++){
            System.out.println((i+1)+"."+hoaDonList.get(i).toString());
        } System.out.println("nhập vị trí muốn sửa");
        int nhap=scanner.nextInt();
        for (int i=0;i<hoaDonList.size();i++){
            if((nhap+1)==i){
                hoaDonList.get(i).setMaKhachHang(NhapDuLieuHoaDon.nhapMaKhangHoaDon());
                hoaDonList.get(i).setNgayRaHoaDon(NhapDuLieuHoaDon.nhapNgayRaHoaDon());
                hoaDonList.get(i).setSoluong(NhapDuLieuHoaDon.nhapSoLuong());
                hoaDonList.get(i).setDoGia(NhapDuLieuHoaDon.nhapDonGia());
                hoaDonList.get(i).setThanhTien(NhapDuLieuHoaDon.nhapThanhtien());
            }
        }
        File file=new File("hoa_don_tien_dien/data/hoaDon.csv");
        DocGhiFIleQuanLyTienDien.ghiHoaDon(hoaDonList,file,false);
    }
}
