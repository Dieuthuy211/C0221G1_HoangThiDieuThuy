package controllers;

import data.WriteFileServices;
import model.House;
import model.Room;
import model.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewServices {
    static Scanner scanner = new Scanner(System.in);
    static WriteFileServices writeFile = new WriteFileServices();

    public static void addVilla() {
        ArrayList<Villa> listVilla = new ArrayList<>();
        System.out.println("nhập id");
        String id = scanner.nextLine();
        Regex regex = new Regex();
            while (regex.checkIDVilA(id) == false) {
                System.out.println("nhập sai mã villa nhập lại");
                id = scanner.nextLine();
            }
        System.out.println("nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        while(regex.checkNameService(serviceName)==false){
            System.out.println("tên dịch vụ sai nhập lại");
            serviceName=scanner.nextLine();
        }
        System.out.println("nhập diện tích sử dụng");
        String areaUsed = scanner.nextLine();
        while (regex.checkArea(areaUsed)==false){
            System.out.println("nhập sai rồi!!! nhập lại");
            areaUsed=scanner.nextLine();
        }
        System.out.println("nhập chi phí thuê");
        String rentalCosts = scanner.nextLine();
        while (regex.checkRentalCosts(rentalCosts)==false){
            System.out.println("nhập sai nhập lại");
            rentalCosts=scanner.nextLine();
        }
        System.out.println("số lượng người tối đa");
        String maximumPeople = scanner.nextLine();
        while (regex.checkMaximumPeople(maximumPeople)==false){
            System.out.println("nhập sai rồi!!! vui lòng nhập lại");
            maximumPeople=scanner.nextLine();
        }
        System.out.println("kiểu thuê");
        String rentalType = scanner.nextLine();
        System.out.println("tiêu chuẩn phòng");
        String standardRoom = scanner.nextLine();
        System.out.println("mô tả tiện nghi khác");
        String otherFacilitie = scanner.nextLine();
        System.out.println("diện tích hồ bơi");
        String poolArea = scanner.nextLine();
        while (regex.checkArea(poolArea)==false){
            System.out.println("nhập sai rồi!!! nhập lại");
            poolArea=scanner.nextLine();
        }
        System.out.println("số tầng");
        String numberFloor = scanner.nextLine();
        while (regex.checkNumberFloor(numberFloor)==false){
            System.out.println("nhập sai rồi!!nhập lại");
            numberFloor=scanner.nextLine();
        }
        Villa villa = new Villa(id, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType, standardRoom, otherFacilitie, poolArea, numberFloor);
        listVilla.add(villa);
        writeFile.wriveFileVila(listVilla);

    }

    public static void addNewHouse() {
        ArrayList<House> listHouse = new ArrayList<>();
        System.out.println("nhập id");
        String id = scanner.nextLine();
        Regex regex = new Regex();
        while (regex.checkIDHouse(id) == false) {
            System.out.println("nhập sai mã villa nhập lại");
            id = scanner.nextLine();
        }
        System.out.println("nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        while(regex.checkNameService(serviceName)==false){
            System.out.println("tên dịch vụ sai nhập lại");
            serviceName=scanner.nextLine();
        }
        System.out.println("nhập diện tích sử dụng");
        String areaUsed = scanner.nextLine();
        while (regex.checkArea(areaUsed)==false){
            System.out.println("nhập sai rồi!!! nhập lại");
            areaUsed=scanner.nextLine();
        }
        System.out.println("nhập chi phí thuê");
        String rentalCosts = scanner.nextLine();
        while (regex.checkRentalCosts(rentalCosts)==false){
            System.out.println("nhập sai nhập lại");
            rentalCosts=scanner.nextLine();
        }
        System.out.println("số lượng người tối đa");
        String maximumPeople = scanner.nextLine();
        while (regex.checkMaximumPeople(maximumPeople)==false){
            System.out.println("nhập sai rồi!!! vui lòng nhập lại");
            maximumPeople=scanner.nextLine();
        }
        System.out.println("kiểu thuê");
        String rentalType = scanner.nextLine();
        System.out.println("tiêu chuẩn phòng");
        String standardRoom = scanner.nextLine();
        System.out.println("mô tả tiện nghi khác");
        String otherFacilitie = scanner.nextLine();
        System.out.println("số tầng");
        String numberFloor = scanner.nextLine();
        while (regex.checkNumberFloor(numberFloor)==false){
            System.out.println("nhập sai rồi!!nhập lại");
            numberFloor=scanner.nextLine();
        }
        House house = new House(id, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType, standardRoom, otherFacilitie, numberFloor);
        listHouse.add(house);
        writeFile.writeFileHouse(listHouse);
    }

    public static void addNewRoom() {
        ArrayList<Room> listRoom = new ArrayList<>();
        Regex regex = new Regex();
        System.out.println("nhập id");
        String id = scanner.nextLine();
        while (regex.checkIDRoom(id)==false){
            System.out.println("nhập sai!!vui lòng nhập lại");
            id=scanner.nextLine();
        }
        System.out.println("nhập tên dịch vụ");
        String serviceName = scanner.nextLine();
        while(regex.checkNameService(serviceName)==false){
            System.out.println("tên dịch vụ sai nhập lại");
            serviceName=scanner.nextLine();
        }
        System.out.println("nhập diện tích sử dụng");
        String areaUsed = scanner.nextLine();
        while (regex.checkArea(areaUsed)==false){
            System.out.println("nhập sai rồi!!! nhập lại");
            areaUsed=scanner.nextLine();
        }
        System.out.println("nhập chi phí thuê");
        String rentalCosts = scanner.nextLine();
        while (regex.checkRentalCosts(rentalCosts)==false){
            System.out.println("nhập sai nhập lại");
            rentalCosts=scanner.nextLine();
        }
        System.out.println("số lượng người tối đa");
        String maximumPeople = scanner.nextLine();
        while (regex.checkMaximumPeople(maximumPeople)==false){
            System.out.println("nhập sai rồi!!! vui lòng nhập lại");
            maximumPeople=scanner.nextLine();
        }
        System.out.println("kiểu thuê");
        String rentalType = scanner.nextLine();
        System.out.println("dịch vụ miễn phí đi kèm");
       String freeService=scanner.nextLine();
        Room room = new Room(id, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType,freeService);
        listRoom.add(room);
        writeFile.writeFileRoom(listRoom);

    }


}
