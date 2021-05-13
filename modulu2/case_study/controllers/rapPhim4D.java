package controllers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class rapPhim4D {
    static Scanner scanner=new Scanner(System.in);
    public  static void disPlayMenu(){
      do {
          System.out.println("1.mua vé\n" +
                  "2.hiển thị danh sách khách mua vé\n" +
                  "3.thoát");
          System.out.println("nhập lựa chọn bạn muốn chọn");
          String chon=scanner.nextLine();
          switch (chon){
              case "1":
                  
                  muave();
                  break;
              case "2":
                  hienthi();
                  break;
              case "3":
                  System.exit(0);
              default:
                  System.err.println("nhập sai!!!vui lòng nhập lại");
          }
      }while (true);
    }

   public static void hienthi() {
    }

    public static void muave() {
        Queue<String>   queue=new LinkedList<>();
        System.out.println("bạn muốn mua vé :\n" +
                "1.có\n" +
                "2.không");
        String chon=scanner.nextLine();
        switch (chon){
            case "1":
                System.out.println("tên khách hàng");
                String ten=scanner.nextLine();
        }
    }

}
