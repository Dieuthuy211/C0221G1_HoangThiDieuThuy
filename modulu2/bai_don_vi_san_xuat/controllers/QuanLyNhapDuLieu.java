package controllers;


import commons.CanBoException;
import commons.GhiDocFile;

import java.util.List;
import java.util.Scanner;

public class QuanLyNhapDuLieu {
   //String hoTen, String namSinh, String gioiTinh, String diaChi
    static Scanner scanner=new Scanner(System.in);
    public static String nhapTen(){
        String ten=null;
        while (true){
            try {
                System.out.println("nhập tên");
                ten=scanner.nextLine();
                CanBoException.kiemTraTen(ten);
                break;
            } catch (CanBoException e) {
                System.err.println(e.getMessage());
            }
        }
        return ten;
    }
    public static  String nhapNamSinh(){
        String namSinh=null;
        while (true){
            try{
                System.out.println("nhập năm sinh");
                namSinh=scanner.nextLine();
                CanBoException.kiemTraNamsinh(namSinh);
                break;
            } catch (CanBoException e) {
                System.err.println(e.getMessage());
            }

        }
        return namSinh;
    }
    public static String nhapGioiTinh(){
        String gioiTinh=null;
        boolean kiemTra = false;
      while (true){
          System.out.println("chon :\n" +
                  "1.Nam\n" +
                  "2.Nữ");
          String chon=scanner.nextLine();
          switch (chon){
              case "1":
                  gioiTinh="Nam";
                  kiemTra=true;
                  break;
              case "2":
                  gioiTinh="Nữ";
                  kiemTra=true;
                  break;
              default:
                  System.out.println("nhập sai!!!");
          }
          if (kiemTra==true){
              break;
          }
      }
      return gioiTinh;
    }
    public static String nhapDiaChi(){
        System.out.println("nhập địa chỉ");
        String diaChi=scanner.nextLine();
        return diaChi;
    }
    public static String nhapBac(){
        String bac;
       while (true){
           try {
               System.out.println("nhập bậc công nhân");
               bac=scanner.nextLine();
               CanBoException.kiemTraBac(bac);
               break;
           } catch (CanBoException e) {
               System.err.println(e.getMessage());
           }
       }
       return bac;
    }
    public static String nhapCongViec(){
        String congViec=null;
        boolean kiemTra=false;
        while (true){
            System.out.println("chọn :\n" +
                    "1.PV-trong nhà\n" +
                    "2.PV-ngoài trời");
            String chon=scanner.nextLine();
            switch (chon){
                case "1":
                    congViec="PV-trong nhà";
                    kiemTra =true;
                    break;
                case "2" :
                    congViec="PV-ngoài trời";
                    kiemTra=true;
                    break;
                default:
                    System.out.println("nhập sai!!!");
            }
            if(kiemTra){
                break;
            }
        }
        return congViec;
    }
    public static String nhapNganhDaoTao(){
        String nganh=null;
        boolean kiemTra=false;
        List<String> strings= GhiDocFile.docFileNganh();
        for (int i=0;i<strings.size();i++) {
            System.out.println((i + 1) + " : " + strings.get(i));
        }
        while (true){
            System.out.println("chọn theo danh mục");
            String chon=scanner.nextLine();
            for (int i=0;i<strings.size();i++){
                if((Integer.parseInt(chon)-1)==i){
                    nganh=strings.get(i).split(",")[1];
                    kiemTra=true;
                    break;
                }
            }
            if(kiemTra){
                break;
            }else {
                System.out.println("nhập sai");
            }
        }
        return nganh;
    }

}


