package baitap;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int size;
        int arr [];
        Scanner input=new Scanner(System.in);
        System.out.print("nhập số luowmgj phần tử mảng ");
        size=input.nextInt();
        arr =new int[size];
        for (int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        for (int j=0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.print("min là = "+min);
    }
}
