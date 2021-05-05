package thuhanh;
import java.util.Scanner;
public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        month=sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
                System.out.print(month+" có 31");
                break;
            case 4:
            case 6:
            case 9:
            case 10:
                System.out.print(month+" có 30");
                break;
            case 2:
                System.out.print(month+" có 29");
                break;
            default:
                System.out.print(month+" không phải là tháng");
        }
    }
}

