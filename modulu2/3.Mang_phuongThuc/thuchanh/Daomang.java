package thuchanh;

import java.util.Scanner;

public class Daomang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số lượng phan tử mảng");
        size = input.nextInt();
        if (size > 5) {
            System.out.println("bị dư số lượng phần tử");
        } else if (size < 5) {
            System.out.println("lượng phần tử bị thiếu");
        } else if (size == 5) {
            System.out.println("nhập phần tử mảng");
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            for (int j = 0; j < arr.length/2; j++) {
                int temp = arr[j];
                arr[j] = arr[size - j-1];
                arr[size - j-1] = temp;
            }

            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }
        }
    }
}