package controllers;

import commons.DinhdangNhap;

import java.util.Scanner;

public class NhapDuLieu {
    static Scanner scanner = new Scanner(System.in);

    //String maDichVu, String tenDichVu, String dienTichSuDUng, String chiPhiThue, String soNguoiToiDa, String kieuThue
///String tieuChuanPhong, String tienNghiKhac, String dienTichHoBoi, String soTang
    //String tenDichVu, String donVi, String giaTien

    public static String nhapTenDichVu(){
        System.out.println("nhập tên dịch vụ");
        String ten=scanner.nextLine();
        while (DinhdangNhap.checkTenDichVu(ten)==false){
            System.err.println("nhập sai vui lòng nhập lại");
            ten= scanner.nextLine();
        }
        return ten;
    }
    public static String nhapMaVilla() {
        System.out.println("nhập mã dịch vụ");
        String maDichVu = scanner.nextLine();
        while (DinhdangNhap.checkIDVilA(maDichVu) == false) {
            System.err.println("nhập sai mã dịch vụ villa");
            maDichVu = scanner.nextLine();
        }
        return maDichVu;
    }
    public static String nhapMaHouse() {
        System.out.println("nhập mã dịch vụ");
        String maDichVu = scanner.nextLine();
        while (DinhdangNhap.checkIDHouse(maDichVu) == false) {
            System.err.println("nhập sai mã dịch vụ house");
            maDichVu = scanner.nextLine();
        }
        return maDichVu;
    }
    public static String nhapMaRoom() {
        System.out.println("nhập mã dịch vụ");
        String maDichVu = scanner.nextLine();
        while (DinhdangNhap.checkIDRoom(maDichVu) == false) {
            System.err.println("nhập sai mã dịch vụ room");
            maDichVu = scanner.nextLine();
        }
        return maDichVu;
    }
    public static String nhapdienTichSuDung(){
        System.out.println("nhập diện tích sử dụng");
        String dientich=scanner.nextLine();
            while (Integer.parseInt(dientich)<30){
                System.err.println("nhập sai!!! vui lòng nhâp lại");
                dientich=scanner.nextLine();
            }

        return dientich;
    }
    public static String nhapSoNguoiToiDa(){
        System.out.println("nhập số lượng người tối đa của dịch vụ");
        String soNguoi=scanner.nextLine();
            while (Integer.parseInt(soNguoi)>20&&Integer.parseInt(soNguoi)<0){
                System.err.println("nhập sai vui lòng nhập lại");
                soNguoi=scanner.nextLine();
            }

        return soNguoi;
    }
    public static String nhapKieuThue(){
        System.out.println("nhập kiểu thuê");
        String kieuThue=scanner.nextLine();
        return kieuThue;
    }
    public static String nhapTieuChuanPhong(){
        System.out.println("nhập tiêu chuẩn phòng");
        String tieuChuanPhong=scanner.nextLine();
        return tieuChuanPhong;
    }
    public static String nhapTienNghiKhac(){
        System.out.println("nhập tiện nghi khác");
        String tienNghiKhac=scanner.nextLine();
        return tienNghiKhac;
    }
    public static String nhapDienTichHoBoi(){
        System.out.println("nhập diện tích hồ bơi");
        String dientich=scanner.nextLine();
            while (Integer.parseInt(dientich)<30){
                System.out.println("nhập sai!!! vui lòng nhâp lại");
                dientich=scanner.nextLine();
            }

        return dientich;
    }
    public static String nhapSoTang(){
        System.out.println("nhâp tầng dich vụ");
        String soTang=scanner.nextLine();
        if(Integer.parseInt(soTang)<0){
            while (Integer.parseInt(soTang)>0){
                System.err.println("nhập sai!!!nhập lại");
                soTang=scanner.nextLine();
            }
        }
        return soTang;
    }
    public static String nhapTenDichVuDiKem(){
        System.out.println("nhập tên dịch vụ kèm theo");
        String dichVuDiKem=scanner.nextLine();
        while (DinhdangNhap.kiemtraTenDichVuDiKem(dichVuDiKem)==false){
            System.err.println("nhập lại ten dịch vụ đi kèm");
            dichVuDiKem=scanner.nextLine();
        }
        return dichVuDiKem;
    }
    public static String nhapdonVi(){
        System.out.println("nhập đơn vị dịch vụ đi kèm");
        String doVi=scanner.nextLine();
        return doVi;
    }
    public static String nhapgiaTien(){
        System.out.println("nhập giá tiền");
        String giaTien=scanner.nextLine();
        while (Integer.parseInt(giaTien)<0){
            System.err.println("nhập lại giá tiền");
            giaTien=scanner.nextLine();
        }
        return  giaTien;
    }
    public static String nhapChiPhiThue(){
        System.out.println("nhập chi phí thuê");
        String chiPhiThue= scanner.nextLine();
        while (Integer.parseInt(chiPhiThue)<0){
            System.err.println("nhập sai nhập lại");
            chiPhiThue=scanner.nextLine();
        }
        return chiPhiThue;
    }
//String hoTen, String ngaySinh, String gioiTinh, String cmnn, String soDienThoai, String email, String loaiKhach, String diaChi, Services service

    public static String nhapTenKhach(){
        System.out.println("nhập ten khách hàng");
        String tenKhachHang=scanner.nextLine();
        while (DinhdangNhap.checkTenKhachHang(tenKhachHang)==false){
            System.err.println("nhập sai nhập lại!!!");
            tenKhachHang=scanner.nextLine();
        }
       return tenKhachHang;
    }
    public static String nhapNgaySinh(){
        System.out.println("nhâp ngày sinh khách hàng");
        String ngaySinh=scanner.nextLine();
        while (DinhdangNhap.checkNgaySinh(ngaySinh)==false){
            System.err.println("nhập sai nhâp lại!!!");
            ngaySinh=scanner.nextLine();
        }
        return ngaySinh;
    }
    public static String nhapCMND(){
        System.out.println("nhập số chứng minh nhân dân");
        String cmnd=scanner.nextLine();
        while (DinhdangNhap.checkCMND(cmnd)==false){
            System.err.println("nhập sai nhập lại!!!");
            cmnd=scanner.nextLine();
        }
        return cmnd;
    }
    public static String nhapgioiTinh(){
        System.out.println("nhập giới tính khách hàng");
        String gioiTinh=scanner.nextLine();
        while (DinhdangNhap.checkGioiTinh(gioiTinh)){
            System.err.println("nhập sai nhập lại!!!");
            gioiTinh=scanner.nextLine();
        }
        return gioiTinh;
    }
    public static String nhapsoDienThoai(){
        System.out.println("nhập số diện thoại");
        String soDienThoai=scanner.nextLine();
      return soDienThoai;
    }
    public  static String nhapEmail(){
        System.out.println("nhập email");
        String email=scanner.nextLine();
        while (DinhdangNhap.checkEmail(email)==false){
            System.err.println("nhập email");
            email=scanner.nextLine();
        }
        return email;
    }
    public static  String nhapLoaiKhach(){
        System.out.println("nhập loại khách");
        String loaiKhach=scanner.nextLine();
        return loaiKhach;
    }
    public static String nhapDiaChi(){
        System.out.println("nhập địa chỉ");
        String diaChi=scanner.nextLine();
        return diaChi;
    }

}