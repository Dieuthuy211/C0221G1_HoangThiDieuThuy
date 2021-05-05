package bai_tap.tim_chuoi_lien_tiep_max;

import java.util.LinkedList;
import java.util.Scanner;

public class SeachString {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();


        System.out.print("Enter a string: ");
        String string = input.nextLine();


        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }

}
