package bai_tap.MyList;

import java.util.Arrays;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return ("id " + id + ", tên " + name);
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "trang");
        Student b = new Student(2, "trung");
        Student c = new Student(3, "linh");
        Student d = new Student(4, "hung");
        Student e = new Student(5, "hoa");
        Student f = new Student(6, "dủng");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.add(f, 3);
//        studentMyList.remove(3);
//        System.out.println(studentMyList.get(2).toString());
//        System.out.println(studentMyList.indexOf(b));
//        System.out.println(studentMyList.contains(c));
//        System.out.println(studentMyList.size());
//        System.out.println( studentMyList.toString());

        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student);
        }
//        studentMyList.clear();
//        MyList<Student> newMyList = studentMyList.clone();
//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student student1 = (Student) newMyList.elements[i];
//            System.out.println(student1);
//        }

    }
}
