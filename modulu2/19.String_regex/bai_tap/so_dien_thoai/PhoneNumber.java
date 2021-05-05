package bai_tap.so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static boolean checkPhoneNumbre(String str){
       String regex="^\\(84\\)-\\([0]{1}[98]{1}[0-9]{8}\\)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập số điện thoại");
        String str=scanner.nextLine();
        System.out.println(checkPhoneNumbre(str));
    }
}
