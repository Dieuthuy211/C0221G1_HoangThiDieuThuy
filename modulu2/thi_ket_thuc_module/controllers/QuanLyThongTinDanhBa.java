package controllers;

import java.util.Scanner;

public class QuanLyThongTinDanhBa {
    public static void disPlayMennuDanhBa() {
       do{
           System.out.println("1.\t xem danh sách\n" +
                   "2.\tthêm mới danh sách\n" +
                   "3.\tcập nhật danh sách\n" +
                   "4.\txóa\n" +
                   "5.\ttìm kiếm\n" +
                   "6.\tđọc vào file\n" +
                   "7.\tghi vào file\n" +
                   "8.\tthoát");
           Scanner scanner = new Scanner(System.in);
           System.out.println("nhập mục bạn muốn lựa chọn");
           String chon = scanner.nextLine();
           switch (chon) {
               case "1":
                   ChucNangDanhBa.hienThi();
                   break;
               case "2":
                   ChucNangDanhBa.themDanhBa();
                   break;
               case "3":
                   ChucNangDanhBa.suaDanhBa();
                   break;
               case "4":
                   ChucNangDanhBa.xoaDanhBa();

                   break;
               case "5":
                   ChucNangDanhBa.timKiem();
                   break;
               case "6":
                   ChucNangDanhBa.ghiFileDanhBa();
                   break;
               case "7":
                   ChucNangDanhBa.docFileDanhBa();
                   break;
               case "8":
                   System.exit(0);
               default:
                   System.err.println("nhập sai vui lòng bấm enter để nhập lại!!!");

           }

       }while (true);
    }
}
