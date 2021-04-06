package thuchanh;

import java.util.Scanner;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    Employee(){

    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return this.firstName +" "+ this.lastName;
    }

    public int getAnnualSalary() {
       return (this.salary)^12;
    }

    public void upToSalary() {
        setSalary(this.salary+(this.salary*10)/100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + getFullname() + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập họ");
        String ho=sc.nextLine();
        System.out.println("nhập tên");
        String ten=sc.nextLine();
        System.out.println("nhập lương");
        int luong=sc.nextInt();
        Employee employee = new Employee(0,ho,ten,luong);
        System.out.println(employee.toString());
        System.out.println("ban muon tang luong cho ho khong\n1.yes\n2.no");
        int check=sc.nextInt();
        if (check==1){
            employee.upToSalary();
            System.out.println(employee.toString());
        }

    }
}
