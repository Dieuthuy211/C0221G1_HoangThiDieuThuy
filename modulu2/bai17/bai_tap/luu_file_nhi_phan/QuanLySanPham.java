package bai_tap.luu_file_nhi_phan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham {
    static Scanner scanner=new Scanner(System.in);
    public  void themSP() throws IOException {
        System.out.println("nhập mã SP");
            String maSP=scanner.nextLine();
            System.out.println("nhập tên SP");
            String tenSP=scanner.nextLine();
            System.out.println("nhập hãng SP");
            String hangSP=scanner.nextLine();
            System.out.println("giá SP");
            String gia=scanner.nextLine();
            System.out.println("mô tả khác");
            String mota=scanner.nextLine();
            SanPham sanPham=new SanPham(maSP,tenSP,hangSP,gia,mota);
        ArrayList<SanPham>listSP=new ArrayList<>();
        listSP.add(sanPham);
        FileStream fileStream=new FileStream();
        fileStream.outFileStream(listSP);
    }

public  void hienThi() throws IOException, ClassNotFoundException {
        FileStream fileStream=new FileStream();
        SanPham sanPham=new SanPham();

        ArrayList<SanPham> listSP=fileStream.inFileStream();

    System.out.println(listSP);
}

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        QuanLySanPham quanLySanPham= new QuanLySanPham();
        quanLySanPham.themSP();
       quanLySanPham.hienThi();
    }
}
