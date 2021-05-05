package thuchanh;

import java.util.Scanner;

public class TimGiaTriMax {
    public static void main(String[] args) {
        int arr[];
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        num=input.nextInt();
        arr =new int[num];
        for (int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        for (int j=0;j<arr.length;j++){
       System.out.print(+arr[j]);
        }
        System.out.println();
        int max=arr[0];
        for(int a=0;a<arr.length;a++){
            if(arr[a]>max){
                max=arr[a];
            }
        }
        System.out.println("max = "+max);
    }
}
