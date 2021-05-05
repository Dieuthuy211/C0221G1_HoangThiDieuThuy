package commons;
public class PhuongTienException extends Exception {

    public PhuongTienException(String message) {
        super(message);
    }

    public static void kiemTraBienXeTai(String bienXeTai) throws PhuongTienException {
        String regex="^[0-9]{2}C-[0-9]{3}.[0-9]{2}$";
        if(!bienXeTai.matches(regex)){
            throw new PhuongTienException("sai biểu mẩu : XXC-XXX.XX");
        }
    }
    public static void kiemTraBienOto(String bienOto) throws PhuongTienException {
        String regex="^[0-9]{2}[AB]-[0-9]{3}.[0-9]{2}$";
        if(!bienOto.matches(regex)){
           throw new PhuongTienException("sai biểu mẩu : XXY-XXX.XX\n" +
                   "Y=A hoặc Y=B");
        }
    }
    public static void kiemTraBienXeMay(String bienXeMay) throws PhuongTienException{
        String regex="^[0-9]{2}-[A-Z][[A-Z]|[0-9]]-[0-9]{3}.[0-9]{2}$";
        if(!bienXeMay.matches(regex)){
            throw new PhuongTienException("sai biểu mẩu : XX-YZ-XXX.XX");
        }
    }
    public static void kiemTraTen(String ten) throws PhuongTienException {
        String regex="^[A-Z][a-z]{2,}$";
        if(!ten.matches(regex)){
           throw new PhuongTienException("sai biểu mẩu : Xxxx");
        }
    }
    public static void kiemTraCongSuat(String congSuat) throws PhuongTienException {
        String regex="^[0-9]{2,3}$";
        if(!congSuat.matches(regex)){
           throw new PhuongTienException("nhập sai công suất xe!!!nhập lại");
        }
    }
    public static void kiemTraSoGhe(String soGhe) throws PhuongTienException {
        String regex="^[1-9]{1,}$";
        if(!soGhe.matches(regex)){
          throw new PhuongTienException("nhập sai số ghế!!nhập lại");
        }
    }
    public static void kiemTraTrongTai(String trongTai) throws PhuongTienException {
        String regex="^[0-9]{1,}";
        if(!trongTai.matches(regex)){
            throw new PhuongTienException("nhập sai tải trọng!!!vui lòng nhập lại");
        }
    }public static void kiemNamSanXuat(String nam) throws PhuongTienException {
        String regex="^[1-2][0-9]{3}$";
        if(!nam.matches(regex)){
            throw new PhuongTienException("nhập sai năm sản xuất!!!vui lòng nhập lại");
        }
    }
}
