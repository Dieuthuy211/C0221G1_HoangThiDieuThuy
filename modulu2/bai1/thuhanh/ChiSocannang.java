package thuhanh;
import java.util.Scanner;
public class ChiSocannang {
    public static void main(String[] args) {
        float weight;
        float height;
        float BIM;
        Scanner cs=new Scanner(System.in);
        height=cs.nextFloat();
        weight=cs.nextFloat();
        BIM=weight/(height*height);
        if(BIM<18.5){
            System.out.print("Underweight");
        }else if(BIM<25){
            System.out.print("normal");
        }else if(BIM<30){
            System.out.print("overweight");
        }else {
            System.out.print("obese");
        }
    }
}
