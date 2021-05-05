package baitap;

import java.util.Scanner;

public class Cylinder extends Circle {

    public int heingt;

    public Cylinder(double radius ,String color,int height) {
        super(radius,color);
        this.heingt=height;
    }

    public int getHeingt() {
        return heingt;
    }

    public void setHeingt(int heingt) {
        this.heingt = heingt;
    }

    public double getVolume(){
        return getArea()*this.heingt;
    }

    @Override
    public String toString() {

        return "Cylinder{" +
                "heingt=" + heingt +
                ", radius=" + getRadius() +
                ", color='" + getColor() +
                ", thể tích hình trụ tròn "+getVolume()+'\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập bán kính");
        double r=sc.nextDouble();
        System.out.println("nhập màu hinh tròn");
        String m=sc.next();
        System.out.println("nhập chiều cao");
        int h=sc.nextInt();
        Cylinder cylinder=new Cylinder(r,m,h);
        System.out.println(cylinder.toString());

    }
}
