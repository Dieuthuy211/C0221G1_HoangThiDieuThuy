package thuhanh;
import java.util.Scanner;
public class Giaiphuongtrinh {
    public static void main(String[] args) {
        float a;
        float b;
        float x;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        if(a!=0){
            x=-b/a;
            System.out.print("nghiệm của phương trinh là "+x);
        }else {
            System.out.print("phưng trinh vô nghiêm0");
        }
    }

}
