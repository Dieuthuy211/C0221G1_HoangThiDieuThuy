package baitap;

import java.util.Scanner;

public class DocSothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so = sc.nextInt();
        if (so < 10) {
            System.out.println(DocSothanhchu(so));
        } else if (100 > so && so >= 10) {
            int hangChuc = so / 10;
            int hangDonVi = so % 10;
            if (hangDonVi == 1) {
                System.out.println(docSoChuc(hangChuc * 10) + " mốt");
            } else if (hangDonVi == 5) {
                System.out.println(docSoChuc(hangChuc * 10) + " lăm");
            } else {
                System.out.println(docSoChuc(hangChuc * 10) + " " + DocSothanhchu(hangDonVi));
            }
        } else if (so >= 100) {
            int hangTram = so / 100;
            int hangChuc = (so % 100) / 10;
            int hangDonVi = so % 10;
            if (hangChuc == 0 && hangDonVi == 0) {
                System.out.println(DocSothanhchu(hangTram) + " trăm");
            } else if (hangChuc == 0 && hangDonVi != 0) {
                System.out.println(DocSothanhchu(hangTram) + " trăm" + " lẻ " + DocSothanhchu(hangDonVi));
            } else if (hangChuc > 0 && hangDonVi == 5) {
                System.out.println(DocSothanhchu(hangTram) + " trăm" + docSoChuc(hangChuc * 10) + "lăm");
            } else if (hangChuc > 1 && hangDonVi == 1) {
                System.out.println(DocSothanhchu(hangTram) + " trăm" + docSoChuc(hangChuc * 10) + "mốt");
            } else if (hangDonVi == 0) {
                System.out.println(DocSothanhchu(hangTram) + " trăm" + docSoChuc(hangChuc * 10));
            }
        }
    }

    public static String DocSothanhchu(int so) {
        String str = "";
        switch (so) {
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;

        }
        return str;
    }

    public static String docSoChuc(int num) {
        int sodu = num % 10;

        String chuoi = "";
        switch (num) {
            case 10:
                chuoi = "mười";
                break;
            case 20:
                chuoi = "hai mươi";
                break;
            case 30:
                chuoi = "ba mươi";
                break;
            case 40:
                chuoi = "bốn mươi";
                break;
            case 50:
                chuoi = "năm mươi";
                break;
            case 60:
                chuoi = "sáu mươi";
                break;
            case 70:
                chuoi = "bảy mươi";
                break;
            case 80:
                chuoi = "tám mươi";
                break;
            case 90:
                chuoi = "chín mươi";
                break;
        }
        return chuoi;

    }
}
