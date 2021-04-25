package controllers;

import data.WriteFileServices;
import model.House;
import model.Room;
import model.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewServices{
    static Scanner scanner=new Scanner(System.in);
   static WriteFileServices writeFile=new WriteFileServices();
    public static void addVilla(){
        ArrayList<Villa> listVilla=new ArrayList<>();
        Villa villa=new Villa();
        System.out.println("nhập id");
        villa.setId(scanner.nextLine());
        System.out.println("nhập tên dịch vụ");
        villa.setServiceName(scanner.nextLine());
        System.out.println("nhập diện tích sử dụng");
        villa.setAreaUsed(scanner.nextLine());
        System.out.println("nhập chi phí thuê");
        villa.setRentalCosts(scanner.nextLine());
        System.out.println("số lượng người tối đa");
        villa.setMaximumPeople(scanner.nextLine());;
        System.out.println("kiểu thuê");
        villa.setRentalType(scanner.nextLine());
        System.out.println("tiêu chuẩn phòng");
        villa.setStandardRoom(scanner.nextLine());
        System.out.println("mô tả tiện nghi khác");
        villa.setOtherFacilitie(scanner.nextLine());
        System.out.println("diện tích hồ bơi");
        villa.setPoolArea(scanner.nextLine());
        System.out.println("số tầng");
        villa.setNumberFloor(scanner.nextLine());
        listVilla.add(villa);
      writeFile.wriveFileVila(listVilla);
    }
    public static void addNewHouse(){
        ArrayList<House> listHouse=new ArrayList<>();
       House house=new House();
        System.out.println("nhập id");
        house.setId(scanner.nextLine());
        System.out.println("nhập tên dịch vụ");
        house.setServiceName(scanner.nextLine());
        System.out.println("nhập diện tích sử dụng");
        house.setAreaUsed(scanner.nextLine());
        System.out.println("nhập chi phí thuê");
        house.setRentalCosts(scanner.nextLine());
        System.out.println("số lượng người tối đa");
        house.setMaximumPeople(scanner.nextLine());;
        System.out.println("kiểu thuê");
        house.setRentalType(scanner.nextLine());
        System.out.println("tiêu chuẩn phòng");
        house.setStandardRoom(scanner.nextLine());
        System.out.println("mô tả tiện nghi khác");
        house.setOtherFacilitie(scanner.nextLine());
        System.out.println("số tầng");
        house.setNumberFloor(scanner.nextLine());
        listHouse.add(house);
        writeFile.writeFileHouse(listHouse);
    }
public static void addNewRoom(){
        ArrayList<Room> listRoom=new ArrayList<>();
        Room room=new Room();
    System.out.println("nhập id");
    room.setId(scanner.nextLine());
    System.out.println("nhập tên dịch vụ");
    room.setServiceName(scanner.nextLine());
    System.out.println("nhập diện tích sử dụng");
    room.setAreaUsed(scanner.nextLine());
    System.out.println("nhập chi phí thuê");
    room.setRentalCosts(scanner.nextLine());
    System.out.println("số lượng người tối đa");
    room.setMaximumPeople(scanner.nextLine());;
    System.out.println("kiểu thuê");
    room.setRentalType(scanner.nextLine());
    System.out.println("dịch vụ miễn phí đi kèm");
    room.setFreeService(scanner.nextLine());
    listRoom.add(room);
   writeFile.writeFileRoom(listRoom);

}


}
