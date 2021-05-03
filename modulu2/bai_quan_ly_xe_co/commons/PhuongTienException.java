package commons;

public class PhuongTienException extends Exception {
    public static void kiemTraBienXeTai(String bienXeTai){
        String regex="^[0-9]{2}C-[0-9]{3}.[0-9]{2}";
        if(!bienXeTai.matches(regex)){
            System.err.println("sai biểu mẩu : XXC-XXX.XX");
        }
    }
    public static void kiemTraBienOto(String bienOto){
        String regex="^[0-9]{2}[AB]-[0-9]{3}.[0-9]{2}$";
        if(!bienOto.matches(regex)){
            System.err.println("sai biểu mẩu : XXY-XXX.XX\n" +
                    "Y=A hoặc Y=B");
        }
    }
    public static void kiemTraBienXeMay(String bienXeMay){
        String regex="^[0-9]{2}C-[0-9]{3}.[0-9]{2}";
        if(!bienXeMay.matches(regex)){
            System.err.println("sai biểu mẩu : XXC-XXX.XX");
        }
    }
}
