package thuchanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args){
        String[]  students={"hoa","huệ","lan","hông"};
        String  student;
        Scanner input=new Scanner(System.in);
        student=input.nextLine();
        for(int i=0;i<students.length;i++){
            if(student.equals(students[i])){
                System.out.print("có");
                break;
            }else {
            System.out.print("tên nhập không có");

        }
        }
    }
}
