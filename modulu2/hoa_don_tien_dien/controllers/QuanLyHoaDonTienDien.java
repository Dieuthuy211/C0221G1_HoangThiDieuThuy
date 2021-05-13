package controllers;

import java.util.Scanner;

public class QuanLyHoaDonTienDien {
    static Scanner scanner=new Scanner(System.in);
    public static void disPlayMenu(){
        String chon;
      do {
          System.out.println("1.thêm mới khách hàng\n" +
                  "2.hiển thị khách hang\n" +
                  "3.tim kiếm khách hàng\n" +
                  "4.thêm mới hóa đơn\n" +
                  "5.chỉnh sửa hóa đơn\n" +
                  "6.hiển thị hóa đơn\n" +
                  "7.thoát");
          System.out.println("nhập mục bạn lựa chọn");
          chon=scanner.nextLine();
          switch (chon){
              case "1":
                  CacChucNang.themMoiKhachHang();
                  break;
              case "2":
                  CacChucNang.hienThiKhachHang();
                  break;
              case "3":
                  CacChucNang.timKiem();
                  break;
              case "4":
                  CacChucNang.themHoaDon();
                  break;
              case "5":
                  CacChucNang.suaHoaDon();
                  break;
              case "6":
                  CacChucNang.hienThiHoaDon();
                  break;
              case "7":
                  System.exit(0);
              default:
                  System.err.println("nhập sai!!!vui lòng bấm enter để được nhập lại!!!");
          }
      }while (true);

    }
}
