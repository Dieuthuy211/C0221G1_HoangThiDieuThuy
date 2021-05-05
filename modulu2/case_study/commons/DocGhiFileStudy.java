package commons;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileStudy {
    public static void ghiFileVilla(List<Villa> villaList, Boolean trangThai, File file) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : villaList) {
                bufferedWriter.write(villa.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ghiFileHouse(List<House> houseList, Boolean trangThai, File file) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : houseList) {
                bufferedWriter.write(house.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ghiFileRoom(List<Room> roomList, Boolean trangThai, File file) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : roomList) {
                bufferedWriter.write(room.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ghiFileCustomer(List<Customer> customerList,boolean trangthai,File file){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file,trangthai);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Customer customer:customerList){
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ghiFileBooking(List<String> stringBooking,boolean trangThai,File file){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file,trangThai);
            bufferedWriter=new BufferedWriter(fileWriter);
         for (String s:stringBooking){
             bufferedWriter.write(s);
             bufferedWriter.newLine();

         }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Villa> docFileVilla() {
        List<Villa> villaList = new ArrayList<>();
        File file = new File("case_study/data/Villa.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        String[] arrayLine = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
                Villa villa = new Villa(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4], arrayLine[5], arrayLine[6], arrayLine[7], arrayLine[8], arrayLine[9]);
                villaList.add(villa);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
    public static List<House> docFileHouse() {
        List<House> houseList = new ArrayList<>();
        File file = new File("case_study/data/House.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        String[] arrayLine = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
               House house= new House(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4], arrayLine[5], arrayLine[6], arrayLine[7], arrayLine[8]);
               houseList.add(house);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
    public static List<Room> docFileRoom() {
        List<Room> roomList = new ArrayList<>();
        File file = new File("case_study/data/Room.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        String[] arrayLine = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
                Room room= new Room(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4], arrayLine[5],new DichVuDiKem(arrayLine[6],arrayLine[7],arrayLine[8]));
                roomList.add(room);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
    public static List<Customer> docCustomer(){
        List<Customer> customerList=new ArrayList<>();
        File file=new File("case_study/data/Customer.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        String[] arrayLine=null;
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                 arrayLine= line.split(",");
                 Customer customer=new Customer(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4], arrayLine[5], arrayLine[6], arrayLine[7]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }
    public  static List<Employee> docEmployee(){
        List<Employee> employeeList=new ArrayList<>();
        File file=new File("case_study/data/Employee.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        String[] arrayLine=null;
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                arrayLine= line.split(",");
               Employee employee=new Employee(arrayLine[0], arrayLine[1], arrayLine[2]);
               employeeList.add(employee);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

}
