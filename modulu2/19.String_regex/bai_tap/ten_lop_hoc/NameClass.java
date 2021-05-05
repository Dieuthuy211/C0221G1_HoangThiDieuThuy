package bai_tap.ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    public boolean checkNameClass(String srt) {
        String regex = "^[CAP]{1}[0-9]{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(srt);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chuổi");
        String str=scanner.nextLine();
        NameClass nameClass=new NameClass();
        System.out.println( nameClass.checkNameClass(str));
    }
}
