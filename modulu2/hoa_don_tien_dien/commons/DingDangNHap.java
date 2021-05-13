package commons;

import java.util.regex.Pattern;

public class DingDangNHap {
    public static boolean maKhachHang(String maKhachHang){
        String regex="^[KHVN]-[0-9]{5}|[KHNN]-[0-9]{5}$";
        return Pattern.matches(regex,maKhachHang);
    }
    public static boolean tenKhachHangVN(String ten){
        String regex="[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+(([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)|([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]))+";
        return Pattern.matches(regex,ten);
    }
    public  static boolean tenKhachHangNN(String ten){
        String regex= "[A-Z][a-z]{2,}";
        return Pattern.matches(regex,ten);
    }
    public static boolean ngayRaHoaDon(String ngay){
        String regex="^([0-9]|[1-2][0-9]|30|31|)/([1-9]|[1][0-2])/([2][0-9]{3})$";
        return Pattern.matches(regex,ngay);
    }
    public static boolean maHoaDon(String ma){
        String regex="^[MHD]-[0-9]{3}$";
        return Pattern.matches(regex,ma);
    }

}
