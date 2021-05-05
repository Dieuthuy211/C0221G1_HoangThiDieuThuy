package thuhanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print(year + " là năm nhuận");
        } else {
            System.out.print(year + " không phải là năm nhuận");
        }
    }
}
