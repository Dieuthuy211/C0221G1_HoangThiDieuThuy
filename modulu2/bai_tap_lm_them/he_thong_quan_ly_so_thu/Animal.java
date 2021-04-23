package he_thong_quan_ly_so_thu;

import java.util.Scanner;

public abstract class Animal {
    String name;
    int age;
    String description;

    public Animal() {
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void disPlay(){
        System.out.println(name+", "+age+", "+description);
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập con vât");
        name=sc.next();
        System.out.println("nhâp tuổi");
        age=sc.nextInt();
        System.out.println("mô tả con vật");
        description=sc.next();
    }
    abstract void showSound();
}
