package common;

public class Validate {
    public static String regexDate(String string){
        String message = null;
        String regex = "^[12]{1}[0-9]{3}\\-(0{1}[1-9]{1}|1[012]{1})\\-([012][0-9]{1}|3[01]{1})$";
        if(!string.matches(regex)){
            message ="Invalid - YYYY-MM-DD";
        }
        return message;
    }
}
