package thuchanh;

import java.util.Scanner;

public class TienLaiNganHang {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        double tienTra=0;
        Scanner input=new Scanner(System.in);
        System.out.println("nhập tiền vay");
        money=input.nextDouble();
        System.out.println("nhập tháng vay");
        month=input.nextInt();
        System.out.println("nhập lãi xuất");
        interset_rate=input.nextDouble();
        for(int i=0;i<month;i++){
            tienTra+=money*interset_rate*i;
        }
        System.out.println(tienTra);
    }
}
