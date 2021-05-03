package controllers;

import java.util.Scanner;

public class DanhMucPhuongTien {
    public static void danhMuc(){
        do{
            System.out.println("Menu :\n" +
                    "1.Thêm mới phương tiện\n" +
                    "2.Hiển thị phương tiện\n" +
                    "3.Xóa phương tiện\n" +
                    "4.Thoát");
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhập mục bạn muốn chọn");
            String chon=scanner.nextLine();
            switch (chon){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("nhập sai!!!vui lòng nhập đúng mục muốn tìm");
            }
        }while (true);
    }
}
