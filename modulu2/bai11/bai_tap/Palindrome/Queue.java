package bai_tap.Palindrome;

import bai_tap.MyList.LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class Queue {
    public static void main(String[] args) {
        Stack stack=new Stack();
        String string;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chuổi");
        string=sc.nextLine();
        for(int i=0;i<string.length();i++){
            stack.push(string.charAt(i));
        }
        String string1="";
        for (int i=0;i<string.length();i++){
            string1+=stack.pop();
        }
        if(string.equalsIgnoreCase(string1)){
            System.out.println("là chuổi đối xứng " +string);
        }else {
            System.out.println("không phải là chuổi đối xứng "+string);
        }


    }
}
