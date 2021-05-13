package controllers;

import commons.DingDangNHap;
import commons.DocGhiFIleQuanLyTienDien;
import model.hoa_don.HoaDon;
import model.khachHang.KhachHang;
import model.khachHang.VietNam;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NhapDuLieuHoaDon {
    static Scanner scanner = new Scanner(System.in);

    public static String nhapMakhachVN() {
        List<KhachHang> list = DocGhiFIleQuanLyTienDien.docKhachHang();
        String ma=null;
        if (list.isEmpty()) {
            ma = "KHVN-00001";
        } else {
            ma = "KHVN-0000" + (list.size() + 1);
        }
        return ma;
    }
    public static String nhapMakhachNN() {
        List<KhachHang> list = DocGhiFIleQuanLyTienDien.docKhachHang();
        String ma;
        if (list.size() == 0) {
            ma = "KHNN-00001";
        } else {
            ma = "KHNN-0000" + String.valueOf(list.size() + 1);
        }
        return ma;
    }

    public static String nhapMaHoaDon() {
        List<HoaDon> list = DocGhiFIleQuanLyTienDien.docHoaDon();
        String ma;
        if (list.size() == 0) {
            ma = "MHD-001";
        } else {
            ma = "MHD-00" + (list.size() + "1");
        }
        return ma;
    }

    public static String nhaploaiKhach() {
        String loaiKhach = null;
        List<String> stringList = DocGhiFIleQuanLyTienDien.docLoaiKhach();
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println((i + 1) + "." + stringList.get(i));
        }
        System.out.println("nhập loại khách bạn muốn chọn");
        String chon = scanner.nextLine();
        for (int j = 0; j < stringList.size(); j++) {
            if ((Integer.parseInt(chon) - 1) == j) {
                loaiKhach = stringList.get(j).split(",")[1];
            }
        }
        return loaiKhach;
    }

    public static String nhapTenVN() {
        System.out.println("nhập tên khách hàng");
        String ten = scanner.nextLine();
        while (!DingDangNHap.tenKhachHangVN(ten)) {
            System.err.println("nhập sai vui long nhập lại!!!");
            ten = scanner.nextLine();
        }
        return ten;
    }
    public static String nhapTenNN(){
        System.out.println("nhập tên khách hàng");
        scanner.next();
        String ten=scanner.nextLine();
        while (!DingDangNHap.tenKhachHangNN(ten)){
            System.err.println("nhập sai vui long nhập lại");
            ten=scanner.nextLine();
        }
        return ten;
    }

    public static double nhapDinhMucTieuThu() {
        double dinhMuc = 0.0d;
        System.out.println("nhập định mức tiêu thụ");
        while (true) {
            try {

                dinhMuc = scanner.nextDouble();

                if (dinhMuc < 0) {
                    System.err.println("nhập sai nhập lai");
                    dinhMuc = scanner.nextDouble();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("nhập sai nhập lại");
                scanner.next();
                nhapDinhMucTieuThu();
            }
        }
        return dinhMuc;
    }

    public static String nhapQuocTich() {
        System.out.println("nhập quốc tịch của khách hàng");
        String quocTich = scanner.nextLine();
        return quocTich;
    }

    public static double nhapDonGia() {

        double donGia = 0.0d;

        while (true) {
            try {
                System.out.println("nhập đơn giá");
                donGia = scanner.nextDouble();

                if (donGia < 0) {
                    System.err.println("nhập sai nhập lai");
                    donGia = scanner.nextDouble();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("nhập sai bấm enter để được nhập lại");
                scanner.next();
                nhapDonGia();
            }
        }
        return donGia;
    }

    public static double nhapSoLuong() {
        double soLuong = 0.0d;

        while (true) {
            try {
                System.out.println("nhập đơn giá");
                soLuong = scanner.nextDouble();

                if (soLuong < 0) {
                    System.err.println("nhập sai nhập lai");
                    soLuong = scanner.nextDouble();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("nhập sai bấm enter để được nhập lại");
                scanner.next();
                nhapSoLuong();
            }
        }
        return soLuong;
    }

    public static String nhapMaKhangHoaDon() {
        String ma = null;
        List<KhachHang> list = DocGhiFIleQuanLyTienDien.docKhachHang();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i).toString());
        }
        System.out.println("bạn muốn chọn mã khách hàng ");
        int chon = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if ((chon + 1) == i) {
                ma = list.get(i).getMaKhachHang();
            }
        }
        return ma;
    }
    public static String nhapNgayRaHoaDon(){
        System.out.println("nhập ngay ra hóa đơn");
        String ngay=scanner.nextLine();
        while (!DingDangNHap.ngayRaHoaDon(ngay)){
            System.err.println("nhập sai nhập lại!!!");
            ngay=scanner.nextLine();
        }
        return ngay;
    }

    public static double nhapThanhtien() {
        List<KhachHang> list = DocGhiFIleQuanLyTienDien.docKhachHang();
        String maKhachHang = nhapMaKhangHoaDon();
        double thanhTien = 0.0d;
        double soluong = nhapSoLuong();
        double dinhMuc = 0.0d;
        if (maKhachHang.contains("VN")) {
            for (KhachHang khachHang : list) {
                if (khachHang instanceof VietNam) {
                    if (khachHang.getMaKhachHang().equals(maKhachHang)) {
                        dinhMuc = ((VietNam) khachHang).getDinhMucTieuThu();
                    }
                }
            }
        }
        double donGia = nhapDonGia();
        if (maKhachHang.contains("KHVN")) {
            if (soluong <= dinhMuc) {
                thanhTien = soluong * donGia;
            } else if (soluong > dinhMuc) {
                thanhTien = (soluong * dinhMuc * donGia) + ((soluong - dinhMuc) * donGia * 2.5);
            }
        } else {
            thanhTien = soluong * donGia;
        }
        return thanhTien;
    }



}
