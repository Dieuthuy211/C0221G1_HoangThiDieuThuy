package controllers;

import data.RearFileServices;

import java.util.Scanner;

public class MainController {

    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        ShowServices showServices=new ShowServices();
        do {
            System.out.println("Menu :" + "\n" +
                    "1.\t Add New Services" + "\n" +
                    "2.\tShow Services" + "\n" +
                    "3.\tAdd New Customer" + "\n" +
                    "4.\tShow Information of Customer" + "\n" +
                    "5.\tAdd New Booking" + "\n" +
                    "6.\tShow Information of Employee" + "\n" +
                    "7.\tExit");

            System.out.println("nhập lựa chọn");
            String num = scanner.nextLine();
            switch (num) {
                case "1":
                    addNewServices();
                    break;
                case "2":

                  showServices.menuShowServices();
                    break;
                case "3":
//                  addNewCustomer();
                    break;
                case "4":
//                  showInformationofCustomer();
                    break;
                case "5":
//                  addNewBooking();
                    break;
                case "6":
//                  showInformationofEmployee();
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("bạn nhập sai vui lòng nhập lại");
                    displayMainMenu();

            }
        } while (true);
    }


    public static void addNewServices() {
        AddNewServices a = new AddNewServices();
        do {
            System.out.println("Menu add new Services :" + "\n" +
                    "1.\tAdd New Villa" + "\n" +
                    "2.\tAdd New House" + "\n" +
                    "3.\tAdd New Room" + "\n" +
                    "4.\tBack to menu" + "\n" +
                    "5.\tExit");
            System.out.println("nhập lựa chon");
            String num = scanner.nextLine();
            switch (num) {
                case "1":
                    a.addVilla();
                    break;
                case "2":
                    a.addNewHouse();
                    break;
                case "3":
                    a.addNewRoom();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("nhập sai vui lòng nhập lại");
                    addNewServices();
            }
        } while (true);
    }

    public static void main(String[] args) {
       displayMainMenu();}
}
