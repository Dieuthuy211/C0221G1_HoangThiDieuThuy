package baitap;

import java.util.Scanner;

public class Hienthihinh {
    public static void main(String[] args) {
        int num1;
        Scanner input=new Scanner(System.in);
        System.out.println("nhập chiều dài");
        num1=input.nextInt();
        for (int i=0;i<num1;i++){
            for (int j=0;j<num1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int a=0;a<=num1;a++){
            for (int b=0;b<a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int c=0;c<num1;c++){
            for (int e=num1;e>c;e--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
