package bai_tap.to_chuc_du_lieu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        List<NhanVien> list = new ArrayList<>();
        list.add(new NhanVien(" hà ", "nữ", "20/2/1997"));
        list.add(new NhanVien(" hoàng ", "nam", "23/06/1997"));
        list.add(new NhanVien(" lan ", "nữ", "24/3/1995"));
        list.add(new NhanVien(" nhung ", "nữ", "2/2/2000"));
        list.add(new NhanVien(" trang ", "nữ", "1/2/2001"));
//        list.sort(Comparator.comparing(NhanVien::getAge));
//        System.out.println(list);
        Collections.sort(list, new Comparator<NhanVien>() {
            DateFormat f = new SimpleDateFormat("MM/dd/yyyy");
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                try {
                    return f.parse(o2.getAge()).compareTo(f.parse(o1.getAge()));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });

        System.out.println(list);
        list.sort(Comparator.comparing(NhanVien::getGender).reversed());
        System.out.println(list);
//        Queue<NhanVien> MALE = new LinkedList<>();
//        Queue<NhanVien> FEMALE = new LinkedList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getGender() == "nữ") {
//                MALE.add(list.get(i));
//            } else {
//                FEMALE.add(list.get(i));
//            }
//        }
//        Stack<NhanVien> stack = new Stack<>();
//        while (!MALE.isEmpty()) {
//            stack.add(MALE.remove());
//        }
//
//        while (!FEMALE.isEmpty()) {
//            stack.add(FEMALE.remove());
//        }
//
//
//        System.out.println(stack);
//
    }
}
