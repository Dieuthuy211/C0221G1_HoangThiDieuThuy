package thuc_hanh.validate_Acconunt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
  private static String anccountRegex="^[_a-z0-9]{6,}$";

    public AccountExample() {
    }
    public boolean validate(String str) {
        Pattern pattern = Pattern.compile(anccountRegex);
        Matcher matcher=pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validAccount = new String[] { ".@", "12345", "123456","abcdefgh" };
        AccountExample accountExample=new AccountExample();
       for (String acout:validAccount){
           boolean isvalid=accountExample.validate(acout);
           System.out.println(isvalid);
       }
    }
}