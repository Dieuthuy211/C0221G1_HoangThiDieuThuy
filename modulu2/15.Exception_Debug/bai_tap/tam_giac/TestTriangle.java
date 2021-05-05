package bai_tap.tam_giac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {

        System.out.println("nhập ba cạnh của tam giác");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhập cạnh a");
                int a = scanner.nextInt();
                System.out.println("nhập cạnh b");
                int b = scanner.nextInt();
                System.out.println("nhập cạnh c");
                int c = scanner.nextInt();
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("là 3 cạnh của tam giác");
                break;

            } catch (IllegalAccessException ex) {
                System.out.println(ex.getMessage());
                System.out.println("nhập sai nhập lại");
            }catch (InputMismatchException ex){
                System.out.println("nhập sai nhập lại");
            }

        }
    }
}
