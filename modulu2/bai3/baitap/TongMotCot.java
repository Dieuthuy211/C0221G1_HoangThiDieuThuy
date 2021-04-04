package baitap;

import java.util.Scanner;

public class TongMotCot {
    public static void main(String[] args) {
        int m;
        int n;
        int arr[][];
        Scanner input=new Scanner(System.in);
        System.out.print("nhập số dòng");
        n=input.nextInt();
        System.out.print("nhập số cột");
        m=input.nextInt();
        arr=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int cotTinh;
        int sum=0;
        System.out.print("nhập cột cần tính");
        cotTinh=input.nextInt();

            for (int j=0;j<arr.length;j++){
                sum += arr[j][cotTinh];
            }
        System.out.print("tong cột = "+sum);
    }
}
