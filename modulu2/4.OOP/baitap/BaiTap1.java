package baitap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
//       Scanner scanner=new Scanner(System.in);
//       System.out.print("nhập a");
//       double
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, -3, 0);
        System.out.println(quadraticEquation.Hienthi());
        System.out.println(quadraticEquation.getTinh());
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(3, -3, 0);
        System.out.println(quadraticEquation1.Hienthi());
        System.out.println(quadraticEquation1.getTinh());
    }

    public static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return this.a;
        }

        public double getB() {
            return this.b;
        }

        public double getC() {
            return this.c;
        }

        private String getTinh() {
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình vô nghiệm!");
                } else {
                    System.out.println("Phương trình có một nghiệm: "
                            + "x = " + (-c / b));
                }

            }
            double delta = (b * b) - (4 * a * c);
            double x1 = 0;
            double x2 = 0;
            if (delta > 0) {
                x1 = ((-b + Math.sqrt(delta)) / 2 * a);
                x2 = ((-b - Math.sqrt(delta)) / 2 * a);
                System.out.println("phương trình có 2 nghiệm" + "x1=" + x1 + ", x2=" + x2);
            } else if (delta == 0) {
                x1 = -b / 2 * a;
                System.out.println("phương trình có nghiệm kép x1=x2=" + x1);
            } else if (delta < 0) {
                System.out.println("phương trình vô nghiệm");
            }
            return "";
        }

        private String Hienthi() {
            return "giải phương trình : " + a + "x^2 + " + b + "x + " + c + "=0";
        }

    }

}

