package bai_tap.to_chuc_du_lieu;

public class NhanVien {
    private  String name;
    private String gender;
    private int age;

    public NhanVien() {
    }

    public NhanVien(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                 name + '\'' +
               ","+ gender + '\'' +
                 ", " +age +
                '}';
    }
}
