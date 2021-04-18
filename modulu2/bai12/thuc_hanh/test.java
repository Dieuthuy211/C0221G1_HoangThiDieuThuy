package thuc_hanh;

import thuc_hanh.phan_biet_HashMap_HashSet.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Student student1=new Student("hạnh",18,"hà nội");
        Student student2=new Student("lan",20,"quảng bình");
        Student student3=new Student("ngọc",17,"đà nẳng");
        Map<Integer,Student> studentMap=new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
//        System.out.println(studentMap);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }

}
