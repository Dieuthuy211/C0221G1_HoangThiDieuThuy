package data;

import model.House;
import model.Room;
import model.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class RearFileServices {
    private static final String fileServices = "D:\\C0221G1-HoangThiDieuThuy\\modulu2\\case_study\\data\\Services.csv";
    public static ArrayList<Villa>  readfileVilla(){
        ArrayList<Villa> listVilla=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(fileServices);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arrvilla=line.split(",");
                if(arrvilla.length==10){
                    Villa villa=new Villa();
                    villa.setId(arrvilla[0]);
                    villa.setServiceName(arrvilla[1]);
                    villa.setAreaUsed(arrvilla[2]);
                    villa.setRentalCosts(arrvilla[3]);
                    villa.setMaximumPeople(arrvilla[4]);
                    villa.setRentalType(arrvilla[5]);
                    villa.setStandardRoom(arrvilla[6]);
                    villa.setOtherFacilitie(arrvilla[7]);
                    villa.setPoolArea(arrvilla[8]);
                    villa.setNumberFloor(arrvilla[9]);
                    listVilla.add(villa);
                }

            }

        }catch (Exception e){
            System.out.println("file không tồn tại");
        }
        return listVilla;
    }
    public static ArrayList<House> readfileHouse(){
        ArrayList<House> listHouse=new ArrayList<>();
        try{
            FileReader fileReader=new FileReader(fileServices);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arrLine=line.split(",");
                if(arrLine.length==9){
                    House house=new House();
                    house.setId(arrLine[0]);
                    house.setServiceName(arrLine[1]);
                    house.setAreaUsed(arrLine[2]);
                    house.setRentalCosts(arrLine[3]);
                    house.setMaximumPeople(arrLine[4]);
                    house.setRentalType(arrLine[5]);
                    house.setStandardRoom(arrLine[6]);
                    house.setOtherFacilitie(arrLine[7]);
                    house.setNumberFloor(arrLine[8]);
                    listHouse.add(house);
                }
            }
        }catch (Exception e){
            System.out.println("không tìm thấy file");
        }
        return listHouse;
    }
    public static ArrayList<Room> readfileRoom(){
        ArrayList<Room> listRoom=new ArrayList<>();
        try{
            FileReader fileReader=new FileReader(fileServices);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                String[] arrLine=line.split(",");
                if(arrLine.length==7){
                    Room room=new Room();
                    room.setId(arrLine[0]);
                    room.setServiceName(arrLine[1]);
                    room.setAreaUsed(arrLine[2]);
                    room.setRentalCosts(arrLine[3]);
                    room.setMaximumPeople(arrLine[4]);
                    room.setRentalType(arrLine[5]);
                    room.setFreeService(arrLine[6]);
                    listRoom.add(room);
                }
            }
        }catch (Exception e){
            System.out.println("không tìm thấy file");
        }
        return listRoom;
    }
//    public static void  readfileRoom(){
//        try{
//            FileReader fileReader=new FileReader(fileServices);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String line =null;
//            while ((line=bufferedReader.readLine())!=null){
//                String[]  arr= line.split(",");
//                if(arr.length==7){
//                    System.out.println(line);
//                }
//            }
//            bufferedReader.close();
//        }catch (Exception e){
//            System.out.println("không tìm thấy file");
//        }
//    }



    //    public static void readfileVilla() {
//        try {
//            FileReader fileReader = new FileReader(fileServices);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String line=null;
//            while ((line=bufferedReader.readLine())!=null){
//            String[]  arr= line.split(",");
//                if(arr.length==10){
//                    System.out.println(line);
//                }
//            }
//            bufferedReader.close();
//        }catch (Exception e){
//            System.out.println("không tìm thấy file");
//        }
//    }
//    public static void readfileHouse(){
//        try{
//            FileReader fileReader=new FileReader(fileServices);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String line=null;
//            while ((line=bufferedReader.readLine())!=null){
//                String[]  arr= line.split(",");
//                if(arr.length==9){
//                    System.out.println(line);
//                }
//            }
//            bufferedReader.close();
//
//        } catch (Exception e) {
//            System.out.println("không tìm thấy file");
//        }
//    }
//
}

