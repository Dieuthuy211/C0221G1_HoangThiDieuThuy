package baitap;

import java.util.Scanner;

public class DemSoKiTu {
    public static void main(String[] args) {
        char num;
     String str;

     Scanner input=new Scanner(System.in);
        System.out.println("nhập chuỗi");
     str=input.nextLine();
        System.out.println("nhập kí tự");
     num=input.next().charAt(0);
     int count=0;
     for (int i=0;i<str.length();i++){
         if(num==str.charAt(i)){
             count++;
         }
     }
        System.out.println(count);
    }
}
