package thuchanh;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        int width = scanner.nextInt();
        System.out.println("nhập chiều rộng");
        int height = scanner.nextInt();
        ChuNhat chuNhat = new ChuNhat(width, height);
        System.out.println(chuNhat.Hienthi());
        System.out.println("diện tích hình chữ nhật là " + chuNhat.getDienTich());
        System.out.println("chu vi hinh chữ nhật là " + chuNhat.getChuVi());

    }


    public static class ChuNhat {
        int width;
        int height;

        public ChuNhat() {

        }

        public ChuNhat(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getDienTich() {
            return this.width * this.height;
        }

        public int getChuVi() {
            return (this.width + this.height) * 2;
        }

        public String Hienthi() {
            return "hinh chữ nhật có " + "chiều dài " + width + " chiều rộng " + height;
        }
    }
}

