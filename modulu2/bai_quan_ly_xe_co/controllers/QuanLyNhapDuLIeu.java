package controllers;

import commons.DocGhiFile;
import commons.DocGhiFileStudy;
import commons.PhuongTienException;

import java.util.List;
import java.util.Scanner;

public class QuanLyNhapDuLIeu {
    static Scanner scanner = new Scanner(System.in);

    //String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSohuu
    public static String nhapBienOto() {
        String bienOto;
        while (true) {
            try {
                System.out.println("nhập biển số xe oto");
                bienOto = scanner.nextLine();
                PhuongTienException.kiemTraBienOto(bienOto);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return bienOto;
    }

    public static String nhapBienXeTai() {
        String bienXeTai;
        while (true) {
            try {
                System.out.println("nhập biển số xe Xe tải");
                bienXeTai = scanner.nextLine();
                PhuongTienException.kiemTraBienXeTai(bienXeTai);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return bienXeTai;
    }

    public static String nhapBienXeMay() {
        String bienXeMay;
        while (true) {
            try {
                System.out.println("nhập biển số xe xe máy");
                bienXeMay = scanner.nextLine();
                PhuongTienException.kiemTraBienXeMay(bienXeMay);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return bienXeMay;
    }

    public static String nhapten() {
        String ten;
        while (true) {
            try {
                System.out.println("nhập ten chủ sở hửu");
                ten = scanner.nextLine();
                PhuongTienException.kiemTraTen(ten);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return ten;
    }

    public static String nhapSoghe() {
        String soGhe;
        while (true) {
            try {
                System.out.println("nhập số ghế");
                soGhe = scanner.nextLine();
                PhuongTienException.kiemTraSoGhe(soGhe);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return soGhe;
    }

    public static String nhapNamSanXuat() {
        String nam;
        while (true) {
            try {
                System.out.println("nhập năm sản xuất");
                nam = scanner.nextLine();
                PhuongTienException.kiemNamSanXuat(nam);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return nam;
    }

    public static String nhapKieuXe() {
        String kieuXe = null;
        boolean kiemTra = false;
        while (true) {
            System.out.println("chọn kiểu xe của bạn :\n" +
                    "1.du lịch\n" +
                    "2.xe khách");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    kieuXe = "du lịch";
                    kiemTra = true;
                    break;
                case "2":
                    kieuXe = "xe khách";
                    kiemTra = true;
                    break;
                default:
                    System.out.println("nhập sai!!!vui lòng nhập đúng mục lựa chọn");
            }
            if (kiemTra) {
                break;
            }
        }
        return kieuXe;
    }

    public static String nhapHang() {
        String hang = null;
        boolean kiemtra = false;
        while (true) {
            List<String> stringList = DocGhiFile.docFileHangSX();
            for (int i = 0; i < stringList.size(); i++) {
                System.out.println((i + 1) + stringList.get(i));
            }

            String chon = scanner.nextLine();
            for (int i = 0; i < stringList.size(); i++) {
                if ((Integer.parseInt(chon) - 1) == i) {
                    hang = stringList.get(i).split(",")[1];
                    kiemtra = true;
                    break;
                }
            }
            if (kiemtra) {
                break;
            } else {
                System.out.println("nhập sai!!!nhập lại");
            }

        }
        return hang;
    }

    public static String nhapCongSuat() {
        String congSuat = null;
        while (true) {
            try {
                System.out.println("nhập công suất xe");
                congSuat = scanner.nextLine();
                PhuongTienException.kiemTraCongSuat(congSuat);
                break;
            } catch (PhuongTienException e) {
                System.out.println(e.getMessage());
            }
        }
        return congSuat;
    }

    public static String nhapTrongTai(){
        String trongTai=null;
        while (true){
            try {
                System.out.println("nhập trọng tải xe");
                trongTai=scanner.nextLine();
                PhuongTienException.kiemTraTrongTai(trongTai);
                break;

            } catch (PhuongTienException e) {
                System.out.println(e.getMessage());
            }
        }
        return trongTai;
    }
}