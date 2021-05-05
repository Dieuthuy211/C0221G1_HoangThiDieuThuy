package baitap;

import java.util.Scanner;

public class TimMaxTrongMangHaiChieu {
    public static void main(String[] args) {
        int arr[][];
        int n;
        int m;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số hàng");
        n = input.nextInt();
        System.out.print("nhập số cột");
        m = input.nextInt();
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[i][j] = input.nextInt();

            }

            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);

            }
        }
        System.out.println();
        int max=arr[0][0];
        int cot=0;
        int hang=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
               if(arr[i][j]>max){
                   max=arr[i][j];
                   cot=j;
                   hang=i;
               }

            }
        }
        System.out.print("max = "+max+" thuộc hàng"+hang+" và cột"+cot);
    }
}
