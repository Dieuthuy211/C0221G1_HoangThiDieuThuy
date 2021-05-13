package controllers;

import commons.DingDangNHap;
import model.hoa_don.HoaDon;
import models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNangDanhBa {
    static Scanner scanner = new Scanner(System.in);
   static List<DanhBa> danhBaList = new ArrayList<>();
    public static void themDanhBa() {
        System.out.println("nhập họ tên");
        String hoten = scanner.nextLine();
        System.out.println("nhập số điện thoại");
        String soDienThoai = scanner.nextLine();
        while (!DinhangNhapDanhBa.kiemTraSoDienThoai(soDienThoai)){
            System.err.println("nhập sai vui lòng nhập lai");
            soDienThoai=scanner.nextLine();
        }
        System.out.println("nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("nhập email");
        String email = scanner.nextLine();
//        while (!DinhangNhapDanhBa.kiemTraEmail(email)){
//            System.err.println("nhập sai vui lòng nhập lại");
//            email=scanner.nextLine();
//        }
        System.out.println("nhập nhóm danh bạ");
        String nhom = scanner.nextLine();
        System.out.println("nhập ngàu sinh");
        String ngaySing = scanner.nextLine();
        System.out.println("nhập giới tính");
        String giơiTinh = scanner.nextLine();
        DanhBa danhBa = new DanhBa(hoten, soDienThoai, diaChi, email, nhom, ngaySing, giơiTinh);

        danhBaList.add(danhBa);


    }

    public static void hienThi() {
        if (danhBaList.isEmpty()) {
            System.out.println("danh bạ trống");
        } else {
            for (int i = 0; i < danhBaList.size(); i++) {
                System.out.println((i + 1) + "." + danhBaList.get(i));
            }
        }
    }

    public static void suaDanhBa() {
        hienThi();
        System.out.println("nhập số điện thoai muốn sửa");
        String nhap = scanner.nextLine();
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).equals(nhap)) {
                System.out.println("nhập  tên");
                danhBaList.get(i).setHoTen(scanner.nextLine());
                System.out.println("nhập số diên thoại");
                danhBaList.get(i).setSoDienThoai(scanner.nextLine());
                danhBaList.get(i).setDiachi(scanner.nextLine());
                danhBaList.get(i).setEmail(scanner.nextLine());
                danhBaList.get(i).setNhom(scanner.nextLine());
                danhBaList.get(i).setNgaySing(scanner.nextLine());
                danhBaList.get(i).setGoiTinh(scanner.nextLine());
            }
        }
    }

    public static void xoaDanhBa() {
        System.out.println("nhập vị trí bạn muốn xóa");
        int nhap = scanner.nextInt();
        for (int i = 0; i < danhBaList.size(); i++) {
            if ((nhap - 1) == i) {
                System.out.println("bạn có muốn xóa không\n" +
                        "1.có\n" +
                        "2.không");
                scanner.nextLine();
                String chon = scanner.nextLine();
                switch (chon) {
                    case "1":
                        danhBaList.remove(i);
                        break;
                    case "2":
                        QuanLyThongTinDanhBa.disPlayMennuDanhBa();
                    default:
                        System.err.println("nhập sai vui lòng nhập lai");
                }
            }
        }
    }

    public static void timKiem(){
        System.out.println("nhập tên bạn muốn tìm");
        String ten=scanner.nextLine();
       for (DanhBa danhBa:danhBaList){
           if(danhBa.getHoTen().contains(ten)){
               System.out.println(danhBa);
           }
       }
    }

    public static void ghiFileDanhBa() {
        File file = new File("thi_ket_thuc_module/data/danhBa.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhBa danhBa : danhBaList) {
                bufferedWriter.write(danhBa.toString());
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

    public static void docFileDanhBa() {
        File file = new File("thi_ket_thuc_module/data/danhBa.csv");
        List<DanhBa> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arrayLine = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
                DanhBa danhBa = new DanhBa(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3],arrayLine[4],arrayLine[5],arrayLine[6]);
                list.add(danhBa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (DanhBa danhBa:list){
            System.out.println(danhBa);
        }
    }
}