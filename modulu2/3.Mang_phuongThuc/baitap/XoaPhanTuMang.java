package baitap;

import java.sql.Array;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5};
        int num;
        int index = 0;
        int arr1[];
        arr1 = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.print("nhập");
        num = input.nextInt();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
            } else {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int x=0;x<arr1.length;x++){
            System.out.print(arr1[x]);
        }
    }
}
