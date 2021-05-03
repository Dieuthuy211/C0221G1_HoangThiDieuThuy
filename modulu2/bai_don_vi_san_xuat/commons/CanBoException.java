package commons;

public class CanBoException extends Exception {
    public CanBoException(String message) {
        super(message);
    }
    //String hoTen, String namSinh, String gioiTinh, String diaChi
    public static void kiemTraTen(String ten) throws CanBoException {
        String regex="^[A-Z][a-z]*$";
        if(!ten.matches(regex)){
            throw new CanBoException("nhập sai định dạng: Xxxx");
        }
    }
    public static void kiemTraNamsinh(String namSinh) throws CanBoException {
        String regex="^[1-2][0-9]{3}$";
        if(!namSinh.matches(regex)){
            throw new CanBoException("nhập sai định dạng: 1xxx or 2xxx");
        }
    }
    public static void kiemTraBac(String bac) throws CanBoException {
        String regex="^[1-7]/7$";
        if(!bac.matches(regex)){
            throw new CanBoException("nhập sai định dạng : x/7");
        }
    }
}
