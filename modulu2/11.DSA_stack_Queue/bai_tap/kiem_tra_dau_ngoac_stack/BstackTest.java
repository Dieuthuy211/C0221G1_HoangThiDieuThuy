package bai_tap.kiem_tra_dau_ngoac_stack;

import java.util.Scanner;
import java.util.Stack;

public class BstackTest {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuổi vào");
        str = sc.nextLine();
        Stack<Character> bStack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push(str.charAt(i));
            } else if (!bStack.isEmpty() && str.charAt(i) == ')' && bStack.peek() == '(') {
                bStack.pop();
            } else if (str.charAt(i) == ')') {
                bStack.push(str.charAt(i));
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
