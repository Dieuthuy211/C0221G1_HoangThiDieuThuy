package bai_tap.quan_li_san_pham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLi extends Product {
    static Scanner sc = new Scanner(System.in);

    ArrayList<Product> listsp = new ArrayList<>();

    public void themSP() {
        int id;
        String name;
        double price;

        System.out.println("nhập id");
        id = sc.nextInt();
        for(int i=0;i<listsp.size();i++){
            if(listsp.get(i).getId()==id){
                while (listsp.get(i).getId()==id){
                    System.out.println("nhập lại id");
                    id = sc.nextInt();
                    i=0;
                }
            }
        }

        System.out.println("nhập tên tên sản phẩm");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("nhập giá sản phẩm");
        price = sc.nextDouble();
        Product product = new Product(id, name, price);
        listsp.add(product);
        hienThi();
    }

    public void hienThi() {
        for (Product product : listsp) {
            System.out.println(product);
        }
    }

    public void xoaSP() {
        int id;

        System.out.println("nhập id muốn xóa");
        id = sc.nextInt();
        boolean check = false;
        if (listsp.size() == 0) {
            System.out.println("chưa có sản phẩm cần thêm sản phẩm");
        } else {
            int index = 0;
            for (int i = 0; i < listsp.size(); i++) {
                if (listsp.get(i).getId() == id) {
                    i = index;
                    check = true;
                    break;
                }
            }
            if (check == true) {
                listsp.remove(index);
                hienThi();
            } else {
                System.out.println("không tìm thấy id");
            }
        }
    }

    public void suaSP() {
        int id;

        System.out.println("nhập id muốn sua");
        id = sc.nextInt();
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i).getId() == id) {
                System.out.println("nhập tên sản phẩm mới");
                String newName = sc.nextLine();
                System.out.println("nhập giá sản phẩm mới");
                double newPice = sc.nextDouble();
                listsp.get(i).setNamesp(newName);
                listsp.get(i).setPrice(newPice);
                break;
            }
        }
        hienThi();

    }

    public void timKiem() {

        System.out.println("nhập tên sản phẩm cần tìm");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i).getNamesp().equals(name)) {
                listsp.get(i);
                check = true;
                System.out.println(listsp.get(i));
            }
        }
        if (check == false) {
            System.out.println("không tìm thấy tên đăng nhập");
        }

    }

    public void sapSep() {
        listsp.sort(Comparator.comparing(Product::getPrice));
        hienThi();
    }

    public static void main(String[] args) {
        QuanLi quanLi = new QuanLi();
        quanLi.sapSep();
        System.out.println("1.thêm sản phẩm");
        System.out.println("2.xóa sản phẩm");
        System.out.println("3.sửa");
        System.out.println("4.tìm kiếm");
        System.out.println("5.thoát");
        Scanner sc = new Scanner(System.in);
        boolean check=true;
        do {
            System.out.println("nhập vào");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    quanLi.themSP();
                    break;
                case 2:
                    quanLi.xoaSP();
                    break;
                case 3:
                    quanLi.suaSP();
                    break;
                case 4:
                    quanLi.timKiem();
                    break;
                case 5:
                    check=false;
                    break;
            }
        }while (check);

    }
}
