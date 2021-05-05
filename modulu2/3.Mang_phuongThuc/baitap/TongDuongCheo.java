package baitap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        int n;
        int arr[][];
        Scanner input = new Scanner(System.in);
        System.out.print("size");
        n = input.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "");
            }

            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }

        }System.out.print("tông các đường chéo là "+sum);
    }
}
