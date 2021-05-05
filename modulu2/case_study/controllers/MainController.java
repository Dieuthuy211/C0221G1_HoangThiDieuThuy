package controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
      do{
            System.out.println("1.\t thêm mới dịch vụ\n" +
                    "2.\thiển thị dich vụ\n" +
                    "3.\tthêm mới khách hàng\n" +
                    "4.\thiển thị thông tin của khách hàng\n" +
                    "5.\tthêm đặt chỗ mới\n" +
                    "6.\thiển thị thông tin của nhân viên\n" +
                    "7.\tthoát\n");
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhập mục bạn muốn lựa chọn");
            String chon=scanner.nextLine();
            switch (chon){
                case "1":
                    HamControllers.themMoiDichVu();
                    break;
                case "2":
                    HamControllers.hienThiDichVu();
                    break;
                case "3":
                    HamControllers.themKhachHang();
                    break;
                case "4":
                    HamControllers.hienThiSapXep();
                    break;
                case "5":
                    HamControllers.themDatCho();
                    break;
                case "6":
                    HamControllers.hienThiNhanVien();
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("nhập sai!!!vui lòng nhấn Enter để nhập lại");
                    scanner.nextLine();
            }
        }while (true);
    }
}
