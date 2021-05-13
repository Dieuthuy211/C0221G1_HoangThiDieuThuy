package controllers;

import commons.DocGhiFileStudy;
import model.*;

import java.io.File;
import java.util.*;

public class HamControllers {
    static Scanner scanne = new Scanner(System.in);
    private String chiPhiThue;

    public static void themMoiDichVu() {
        do {
            System.out.println("1.\tthêm mới villa\n" +
                    "2.\t thêm mới house\n" +
                    "3.\tthêm mới Room\n" +
                    "4.\tquay về menu chính\n" +
                    "5.\tthoát\n");
            System.out.println("nhập mục bạn muốn thêm");
            String chon = scanne.nextLine();
            switch (chon) {
                case "1":
                    themvilla();
                    break;
                case "2":
                    themhouse();
                    break;
                case "3":
                    themRoom();
                    break;
                case "4":
                    MainController.displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.err.println("nhập sai vui lòng nhập lại!!!");
            }
        } while (true);
    }

    private static void themRoom() {
        String maRoom = NhapDuLieu.nhapMaRoom();
        String ten = NhapDuLieu.nhapTenDichVu();
        String dienTichSuDdung = NhapDuLieu.nhapdienTichSuDung();
        String chiPhiThue = NhapDuLieu.nhapChiPhiThue();
        String soNguoi = NhapDuLieu.nhapSoNguoiToiDa();
        String kieuThue = NhapDuLieu.nhapKieuThue();
        String tenDiVuDiKem = NhapDuLieu.nhapTenDichVuDiKem();
        String donVi = NhapDuLieu.nhapdonVi();
        String giaTien = NhapDuLieu.nhapgiaTien();
        DichVuDiKem dichVuDiKem = new DichVuDiKem(tenDiVuDiKem, donVi, giaTien);
        Room room = new Room(maRoom, ten, dienTichSuDdung, chiPhiThue, soNguoi, kieuThue, dichVuDiKem);
        List<Room> roomList = new ArrayList<>();
        roomList.add(room);
        File file = new File("case_study/data/Room.csv");
        DocGhiFileStudy.ghiFileRoom(roomList, true, file);
    }

    private static void themhouse() {
        String maHouse = NhapDuLieu.nhapMaHouse();
        String ten = NhapDuLieu.nhapTenDichVu();
        String dienTichSuDdung = NhapDuLieu.nhapdienTichSuDung();
        String chiPhiThue =NhapDuLieu.nhapChiPhiThue();
        String soNguoi = NhapDuLieu.nhapSoNguoiToiDa();
        String kieuThue = NhapDuLieu.nhapKieuThue();
        String tieuchuanPhong = NhapDuLieu.nhapTieuChuanPhong();
        String tienNghiKhac = NhapDuLieu.nhapTienNghiKhac();
        String soTang = NhapDuLieu.nhapSoTang();
        House house = new House(maHouse, ten, dienTichSuDdung, chiPhiThue, soNguoi, kieuThue, tieuchuanPhong, tienNghiKhac, soTang);
        List<House> houseList = new ArrayList<>();
        houseList.add(house);
        File file = new File("case_study/data/House.csv");
        DocGhiFileStudy.ghiFileHouse(houseList, true, file);
    }

    private static void themvilla() {
        //String maDichVu, String tenDichVu, String dienTichSuDUng, String chiPhiThue, String soNguoiToiDa, String kieuThue
//String tieuChuanPhong, String tienNghiKhac, String dienTichHoBoi, String soTang

        String maVilla = NhapDuLieu.nhapMaVilla();
        String ten = NhapDuLieu.nhapTenDichVu();
        String dienTichSuDdung = NhapDuLieu.nhapdienTichSuDung();
        String chiPhiThue = NhapDuLieu.nhapChiPhiThue();
        String soNguoi = NhapDuLieu.nhapSoNguoiToiDa();
        String kieuThue = NhapDuLieu.nhapKieuThue();
        String tieuchuanPhong = NhapDuLieu.nhapTieuChuanPhong();
        String tienNghiKhac = NhapDuLieu.nhapTienNghiKhac();
        String dienTichHoBoi = NhapDuLieu.nhapDienTichHoBoi();
        String soTang = NhapDuLieu.nhapSoTang();
        Villa villa = new Villa(maVilla, ten, dienTichSuDdung, chiPhiThue, soNguoi, kieuThue, tieuchuanPhong, tienNghiKhac, dienTichHoBoi, soTang);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa);
        File filevilla = new File("D:\\C0221G1_HoangThiDieuThuy\\modulu2\\case_study\\data\\Villa.csv");
        DocGhiFileStudy.ghiFileVilla(villaList, true,filevilla);
    }

    public static void hienThiDichVu() {
        do {
            System.out.println("1.\thiển thị villa\n" +
                    "2.\thiển thi House\n" +
                    "3.\thiển thị Room\n" +
                    "4.\thiển thị tên Villa không trùng lặp\n" +
                    "5.\thiển thị tên House không trùng lặp\n" +
                    "6.\thiển thị tên Room không trùng lặp \n" +
                    "7.\tquay về menu chính\n" +
                    "8.\tthoát\n");
            System.out.println("nhập mục bạn muốn xem");
            String chon = scanne.nextLine();
            switch (chon) {
                case "1":
                    hienThiVilla();
                    break;
                case "2":
                    hienThiHouse();
                    break;
                case "3":
                    hienThiRoom();
                    break;
                case "4":
                    villaKhongTrung();
                    break;
                case "5":
                    houseKhongTrung();
                    break;
                case "6":
                    roomKhongTrung();
                    break;
                case "7":
                    MainController.displayMainMenu();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.err.println("nhập sai vui long nhập lại");
            }
        } while (true);
    }

    private static void roomKhongTrung() {
        List<Room> roomList = DocGhiFileStudy.docFileRoom();
        for (int i = 0; i < roomList.size(); i++) {
            for (int j = 0; j < roomList.size(); j++) {
                if (roomList.get(i).getTenDichVu() != roomList.get(j).getTenDichVu()) {
                    System.out.println(roomList.get(i));
                }
            }
        }
    }

    private static void houseKhongTrung() {
        List<House> houseList = DocGhiFileStudy.docFileHouse();
        for (int i = 0; i < houseList.size(); i++) {
            for (int j = 0; j < houseList.size(); j++) {
                if (houseList.get(i).getTenDichVu() != houseList.get(j).getTenDichVu()) {
                    System.out.println(houseList.get(i));
                }
            }
        }
    }

    private static void villaKhongTrung() {
        List<Villa> villaList = DocGhiFileStudy.docFileVilla();
        for (int i = 0; i < villaList.size(); i++) {
            for (int j = 0; j < villaList.size(); j++) {
                if (villaList.get(i).getTenDichVu() != villaList.get(j).getTenDichVu()) {
                    System.out.println(villaList.get(i));
                }
            }
        }
    }

    private static void hienThiRoom() {
        List<Room> roomList = DocGhiFileStudy.docFileRoom();
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    private static void hienThiHouse() {
        List<House> houseList = DocGhiFileStudy.docFileHouse();
        for (House house : houseList) {
            System.out.println(house);
        }
    }

    private static void hienThiVilla() {
        List<Villa> villaList = DocGhiFileStudy.docFileVilla();
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
    }


    public static void hienThiSapXep() {
        List<Customer> customerList = DocGhiFileStudy.docCustomer();
        customerList.sort(Comparator.comparing(Customer::getHoTen));
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static void themKhachHang() {
        //String hoTen, String ngaySinh, String gioiTinh, String cmnn, String soDienThoai, String email, String loaiKhach, String diaChi, Services service
        String hoTen = NhapDuLieu.nhapTenKhach();
        String ngaySinh = NhapDuLieu.nhapNgaySinh();
        String gioiTinh = NhapDuLieu.nhapgioiTinh();
        String cmnd = NhapDuLieu.nhapCMND();
        String soDienThoai = NhapDuLieu.nhapsoDienThoai();
        String email = NhapDuLieu.nhapEmail();
        String loaiKhach = NhapDuLieu.nhapLoaiKhach();
        String diaChi = NhapDuLieu.nhapDiaChi();
        Customer customer = new Customer(hoTen, ngaySinh, gioiTinh, cmnd, soDienThoai, email, loaiKhach, diaChi);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        File file = new File("case_study/data/Customer.csv");
        DocGhiFileStudy.ghiFileCustomer(customerList, true, file);
    }

    public static void themDatCho() {
        List<Customer> customerList = DocGhiFileStudy.docCustomer();
        System.out.println("nhập cmnn của bạn");
        String nhap = scanne.nextLine();
        for (Customer customer : customerList) {
            if (customer.equals(nhap)) {
                do {
                    System.out.println("1.\tĐặt Trước Villa\n" +
                            "2.\tĐặt Trước House\n" +
                            "3.\tĐặt Trước Room\n");
                    System.out.println("lưa chọn dich vu bain muốn đặt");
                    String chon = scanne.nextLine();
                    switch (chon) {
                        case "1":
                            datVilla(customer.toString());
                            break;
                        case "2":
                            dathouse(customer.toString());
                            break;
                        case "3":
                            datRoom(customer.toString());
                            break;
                        default:
                            System.err.println("nhập sai vui long nhập lại");

                    }
                } while (true);
            } else {
                System.err.println("nhập sai!!!nhấn enter để nhập lại");
                scanne.nextLine();
                themDatCho();
            }
        }
    }

    private static void datRoom(String khachHang) {

        List<Room> roomList = DocGhiFileStudy.docFileRoom();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println((i + 1) + "." + roomList.get(i));
        }
        System.out.println("chọn villa bạn muốn đặt");
        String chon = scanne.nextLine();
        String stringBook = null;
        for (int i = 0; i < roomList.size(); i++) {
            if ((Integer.parseInt(chon) - 1) == i) {
                stringBook = roomList + "khách hàng :" + khachHang;
                stringList.add(stringBook);
            }
        }
        File file = new File("case_study/data/Booking.CSV");
        DocGhiFileStudy.ghiFileBooking(stringList, true, file);
    }

    private static void dathouse(String khachHang) {
        List<House> houseList = DocGhiFileStudy.docFileHouse();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println((i + 1) + "." + houseList.get(i));
        }
        System.out.println("chọn villa bạn muốn đặt");
        String chon = scanne.nextLine();
        String stringBook = null;
        for (int i = 0; i < houseList.size(); i++) {
            if ((Integer.parseInt(chon) - 1) == i) {
                stringBook = houseList + "khách hàng :" + khachHang;
                stringList.add(stringBook);
            }
        }
        File file = new File("case_study/data/Booking.CSV");
        DocGhiFileStudy.ghiFileBooking(stringList, true, file);

    }


    private static void datVilla(String khachHang) {
        List<Villa> villaList = DocGhiFileStudy.docFileVilla();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println((i + 1) + "." + villaList.get(i));
        }
        System.out.println("chọn villa bạn muốn đặt");
        String chon = scanne.nextLine();
        String stringBook = null;
        for (int i = 0; i < villaList.size(); i++) {
            if ((Integer.parseInt(chon) - 1) == i) {
                stringBook = villaList + "khách hàng :" + khachHang;
                stringList.add(stringBook);
            }
        }
        File file = new File("case_study/data/Booking.CSV");
        DocGhiFileStudy.ghiFileBooking(stringList, true, file);

    }

    public static void hienThiNhanVien() {
        List<Employee> employeeList = DocGhiFileStudy.docEmployee();

        Map<Integer, Employee> map = new TreeMap<>();
        int value = 1;
        for (int i = 0; i < employeeList.size(); i++) {
            map.put(value, employeeList.get(i));
            value++;
        }
        Set<Integer> set = map.keySet();
        for (Integer a : set) {
            System.out.println(a + "." + map.get(a));
        }
    }


}
