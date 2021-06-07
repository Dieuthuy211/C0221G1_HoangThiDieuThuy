package common;

public class Validate {
//    final static String MA_KHACH_HANG = "^(KH)-[0-9]{4}$";
//    final static String MA_DICH_VU = "^(DV)-[0-9]{4}$";
//    final static String SO_DIEN_THOAI = "^((090)|(091)|(\\(84\\)\\+(90))|(\\(84\\)+(91)))[0-9]{7}$";
//    private final String CARD = "^([0-9]{9}|[0-9]{12})$";
//    private final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
//     final static String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
//    final String NUMBER = "^[0-9]{1,}$";
//
//
//    public void checkCustomer(String string) throws Exception {
//        if (!string.matches(MA_KHACH_HANG)) {
//            throw new Exception("KH-XXXX");
//        }
//    }
//
//    public void checkPhone(String string) throws Exception {
//        if (!string.matches(SO_DIEN_THOAI)) {
//            throw new Exception("KH-XXXX");
//        }
//    }
//
//    public void checkNumber(String string) throws Exception {
//        if (!string.matches(NUMBER)) {
//            throw new Exception("KH-XXXX");
//        }
//
//    }
//
//    public static String checkDate(String string) throws Exception {
//        if (!string.matches(REGEX_DATE)) {
//            throw new Exception("KH-XXXX");
//        }
//
//        return string;
        static String message = null;
        public static String regexCodeCustomer(String string){
            String regex = "^(KH)-[0-9]{4}$";
            if(!string.matches(regex)){
                message = "Invalid - (KH-XXXX)";
            }
            return message;
        }
        public static String regexCodeService(String string){
            String regex = "^(DV)-[0-9]{4}$";
            if(!string.matches(regex)){
                message ="Invalid - (DV-XXXX)";
            }
            return message;
        }
        public static String regexPhone(String string){
            String regex = "(090|091|\\(84\\)\\+90|\\(84\\)\\+91)[0-9]{7}$";
            if(!string.matches(regex)){
                message ="Invalid - 090xxxxxxx or 091xxxxxxx or (84)+90xxxxxxx or (84)+91xxxxxxx";
            }
            return message;
        }
        public static String regexIdCard(String string){
            String regex = "^[0-9]{9}|[0-9]{12}$";
            if(!string.matches(regex)){
                message ="Invalid - xxxxxxxxx or xxxxxxxxxxxx";
            }
            return message;
        }
        public static String regexEmail(String string){
            String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
            if(!string.matches(regex)){
                message ="Invalid - xxxx@xxx.xxx";
            }
            return message;
        }
        public static String regexDate(String string){
            String regex = "^[12]{1}[0-9]{3}\\-(0{1}[1-9]{1}|1[012]{1})\\-([012][0-9]{1}|3[01]{1})$";
            if(!string.matches(regex)){
                message ="Invalid - YYYY-MM-DD";
            }
            return message;
        }
        public static String regexNumber(String string){
            String regex ="^[0-9]{1,}[0-9]*$";
            if(!string.matches(regex)){
                message ="Invalid - positive numbers";
            }
            return message;
        }
    }
