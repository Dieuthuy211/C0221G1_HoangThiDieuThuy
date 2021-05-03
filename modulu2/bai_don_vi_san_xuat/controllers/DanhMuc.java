package controllers;

import java.util.Scanner;

public class DanhMuc {
    public static void quanLi() {
       do{ System.out.println("Menu :\n" +
                "1.Thêm Cán Bộ\n" +
                "2.Tìm kiếm\n" +
               "3.sắp xếp theo tên\n" +
                "4.Hiển thị\n" +
               "5.xóa\n" +
                "6.Thoát");
           System.out.println("nhập mục bạn muốn chọn");
           Scanner scanner=new Scanner(System.in);
           String num=scanner.nextLine();
           switch (num){
               case "1":
                   QuanLyChucNang.themCanBo();
                   break;
               case "2":
                   QuanLyChucNang.timKiem();
                   break;
               case "3":
                   QuanLyChucNang.sapXep();
                   break;
               case "4":
                   QuanLyChucNang.hienthi();
                   break;
               case "5":
                   QuanLyChucNang.xoa();
                   break;
               case "6":
                   System.exit(0);
               default:
                   System.out.println("nhập sai!!");
           }
       }while (true);

    }
}
