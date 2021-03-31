package thuhanh;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        int width;
        int height;
        int acreage;
        int perimeter;
        Scanner scanner = new Scanner(System.in);
       System.out.println("nhập chiều dài");
       width=scanner.nextInt();

        System.out.println("nhập chiều rộng");
        height=scanner.nextInt();
        acreage=width*height;
       perimeter=(width+height)*2;
        System.out.println(acreage);
        System.out.print(perimeter);

    }
}
