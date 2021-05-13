package controllers;

import java.util.regex.Pattern;

public class DinhangNhapDanhBa {
    private static final String SO_DIEN_THOAI="[0-9]{10,11}";
    private static final String EMAIL = "([A-Za-z0-9]{2})@[a-z]{3,}.[a-z]{2,3}";
    private static final String NGAY_SINH = "^([0-2][0-9]|30|31)[/]([0][1-9]|11|12)[/](19[0-9][1-9]|200[0-3])$";
    public static boolean ten(String ten){
        String regex="[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+(([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)|([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]))+";
        return Pattern.matches(regex,ten);
    }
    public static boolean kiemTraNgaySinh(String ngaySinh) {
        return Pattern.matches(NGAY_SINH, ngaySinh);
    }
    public static boolean kiemTraEmail(String email) {
        return Pattern.matches(EMAIL,email);
    }
    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        return Pattern.matches(SO_DIEN_THOAI,soDienThoai);
    }

}
