package thuchanh;

import java.util.Scanner;

public class SinhVienDo {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("nhập chiều dài mảng");
        num=input.nextInt();
        int[]arr=new int[num];
        for (int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        int dem=0;
        for (int i=0;i<num;i++){
           if(arr[i]>=5){
               dem++;
           }
        }
        System.out.print("số sinh viên qua "+dem);

    }
}
