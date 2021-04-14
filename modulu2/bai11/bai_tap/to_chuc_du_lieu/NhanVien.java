package bai_tap.to_chuc_du_lieu;

import java.util.Comparator;

public class NhanVien {
    private  String name;
    private String gender;
    private String age;

    public NhanVien() {
    }

    public NhanVien(String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }


    public String getAge() {
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
