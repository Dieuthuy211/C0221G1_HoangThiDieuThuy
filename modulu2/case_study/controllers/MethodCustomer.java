package controllers;

import data.WriteFileServices;
import data.WriteReadCustomer;
import model.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MethodCustomer {
    static WriteReadCustomer writeReadCustomer = new WriteReadCustomer();

    public static void addNewCustomer() {
        Regex regex=new Regex();
        ArrayList<Customer> listCtoner = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id customer");
        String id = scanner.nextLine();
        System.out.println("nhập họ tên customer");
        String fullname = scanner.nextLine();
        while (regex.checkFullNam(fullname)==false){
            System.out.println("nhập sai!!nhập lại");
            fullname=scanner.nextLine();
        }
        System.out.println("nhập ngày sinh customer");
        String dateOfBirth = scanner.nextLine();
        while (regex.checkDataOfBirth(dateOfBirth)==false){
            System.out.println("nhập sai!!nhập lại");
            dateOfBirth=scanner.nextLine();
        }
        System.out.println("nhập giới tính customer");
        String gender = scanner.nextLine();
        while (regex.checkGender(gender)==false){
            System.out.println("nhập sai!!nhập lại");
            gender=scanner.nextLine();
        }
        System.out.println("nhập số chứng minh nhân dân custumer");
        String identityCard = scanner.nextLine();
        while (regex.checkIdentityCard(identityCard)==false){
            System.out.println("nhập sai!!nhập lại");
            identityCard=scanner.nextLine();
        }
        System.out.println("nhập số điện thoại custumer");
        String phone = scanner.nextLine();
        System.out.println("nhập email custumer");
        String email = scanner.nextLine();
        while (regex.checkEmail(email)==false){
            System.out.println("nhập sai!!nhập lại");
            email=scanner.nextLine();
        }
        System.out.println("nhập loại khách");
        String typeCustomer = scanner.nextLine();
        System.out.println("nhập địa chỉ services custumer sử dụng");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, fullname, dateOfBirth, gender, identityCard, phone, email, typeCustomer, address);
        listCtoner.add(customer);
        writeReadCustomer.writeCusroner(listCtoner);
    }
    public static void showInformationCustomers(){
        ArrayList<Customer>listcCustomer=writeReadCustomer.readCustomer();
        for (Customer customer:listcCustomer) {
            customer.setFirstName(customer.getFullName());
        }
        listcCustomer.sort(Comparator.comparing(Customer::getFirstName));
        for (Customer customer:listcCustomer){
            System.out.println(customer);
        }
    }

}
