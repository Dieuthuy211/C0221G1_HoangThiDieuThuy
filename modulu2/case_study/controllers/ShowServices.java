package controllers;

import data.RearFileServices;
import model.House;
import model.Room;
import model.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowServices {

    private static RearFileServices rearFileServices = new RearFileServices();

    public static void showVilla() {
        ArrayList<Villa> listVilla = new ArrayList<>();
        listVilla = rearFileServices.readfileVilla();
        for (Villa villa1 : listVilla) {
            System.out.println(villa1);
        }
    }

    public static void showHouse() {
        ArrayList<House> listHouse = new ArrayList<>();
        listHouse = rearFileServices.readfileHouse();
        for (House house : listHouse) {
            System.out.println(house);
        }
    }

    public static void showRoom() {
        ArrayList<Room> listRoom = new ArrayList<>();
        listRoom = rearFileServices.readfileRoom();
        for (Room room : listRoom) {
            System.out.println(room);
        }
    }

    static void menuShowServices() {
        RearFileServices rearFileServices = new RearFileServices();
        do {
            System.out.println("Menu Show Services :\n" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập lựa chộn bạn muốn  chọn");
            String num = scanner.nextLine();
            switch (num) {
                case "1":
                    showVilla();
                    break;
                case "2":
                    showHouse();
                    break;
                case "3":
                    showRoom();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    MainController mainController = new MainController();
                    mainController.displayMainMenu();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("nhập sai.vui lòng nhập lại !!!");
                   menuShowServices();
            }
        }
        while (true);
    }

}
