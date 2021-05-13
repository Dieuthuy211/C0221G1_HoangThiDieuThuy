package commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DinhdangNhap {
    private static final String FULL_NAME = "[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+(([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)|([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]))+";
    private static final String EMAIL = "[A-Za-z0-9]{6,}@[a-z]{3,4}.[a-z]{2,3}";
    private static final String DATE_OF_BIRTH = "^([0-2][0-9]|30|31)[/]([0][1-9]|11|12)[/](19[0-9][1-9]|200[0-3])$";
    private static final String EMAIL1 = "([A-Za-z0-9]{2})@[a-z]{3,}.[a-z]{2,3}";
    private static final String IDENTITYCARD = "^[0-9]{9}$";


    public static boolean checkCMND(String cmnd) {
        return Pattern.matches(IDENTITYCARD, cmnd);
    }

    public static boolean checkGioiTinh(String gioiTinh) {
        return Pattern.matches(EMAIL1, gioiTinh);
    }

    public static boolean checkNgaySinh(String ngaySinh) {
        return Pattern.matches(DATE_OF_BIRTH, ngaySinh);
    }

    public static boolean checkEmail(String email) {
        return Pattern.matches(EMAIL, email);
    }

    public static boolean checkTenKhachHang(String tenKhachHang) {
        return Pattern.matches(FULL_NAME, tenKhachHang);
    }

    public static boolean checkIDVilA(String ma) {
        String regexid = "^SVVL-[0-9]{4}$";

        return Pattern.matches(regexid, ma);
    }

    public static boolean checkIDHouse(String ma) {
        String regexID = "^SVHO-[0-9]{4}$";
//        Pattern pattern=Pattern.compile(regexID);
//        Matcher matcher=pattern.matcher(id);
        return Pattern.matches(regexID, ma);
    }

    public static boolean checkIDRoom(String ma) {
        String regexId = "^SVRO-[0-9]{4}$";
        return Pattern.matches(regexId, ma);
    }

    //tên dịch vụ
    public static boolean checkTenDichVu(String tenDichVu) {
        String regexNameSevice = "^[A-Z]{1}[a-z]{2,}$";
        return Pattern.matches(regexNameSevice, tenDichVu);
    }

    public static boolean kiemtraTenDichVuDiKem(String dichVuDiKem) {
        String regex = "^massage|karaoke|food|drink|car$";
        return Pattern.matches(regex, dichVuDiKem);
    }

    public static boolean kiemTraDienTich(String dienTich) {
        String regex="^[3-9][0-9]|[1-9]{3,}$";
        return Pattern.matches(regex,dienTich);
    }
    public static boolean kiemSo(String so) {
        String regex="^[1-9]{1,}$";
        return Pattern.matches(regex,so);
    }
}
