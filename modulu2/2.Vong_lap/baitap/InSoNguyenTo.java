package baitap;

import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số lượng số nguyên tố cần in ra");
        num = input.nextInt();
        for (int j=2; j<1000; j++){
            if (count==num){
                break;
            }
            else if (checkPrime(j)==true){
                System.out.println(j);
                count++;
            }
        }
    }
    public static boolean checkPrime(int number){
        boolean check=true;
        for (int i=2; i<=Math.sqrt(number); i++){
            if (number%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
}
