package bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class StackNhiThapPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số");
        num = sc.nextInt();
        while (num != 0) {
           int temp = num % 2;
           stack.push(temp);
           num = num / 2;
        }
//        for(int i=0;i<=stack.size();i++){
//            System.out.println(stack.pop());
//        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}