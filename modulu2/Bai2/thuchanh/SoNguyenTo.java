package thuchanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num<2){
            System.out.print("không phải là số nguyên tố");
        }else if(num>2){
            boolean check=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    check=true;
                    break;
                }else {
                    check=false;
                }
            }
            if(check){
                System.out.print("không phải là số nguyên tố");
            }else {
                System.out.print("là số nguyên tố");
            }
        }else if(num==2){
            System.out.print("là số nguyên tố");
        }
    }
}
