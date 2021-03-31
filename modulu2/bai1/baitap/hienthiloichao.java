package baitap;

import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.print("chào bạn "+name);
    }

    public static class doitien {
        public static void main(String[] args) {
            int nhapTien;
            int VND;
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập số tiền USD bạn cần đổi");
            nhapTien=sc.nextInt();
            VND=nhapTien*23000;
            System.out.print(VND);
        }
    }
}
