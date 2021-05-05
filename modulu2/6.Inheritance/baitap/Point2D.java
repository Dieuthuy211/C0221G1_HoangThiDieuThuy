package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhập x");
//        float x=sc.nextFloat();
//        System.out.println("nhập y");
//        float y=sc.nextFloat();
//        Point2D point2D=new Point2D(x,y);
//        for (int i=0;i<point2D.getXY().length;i++){
//            System.out.print(point2D.getXY()[i]+",");
//        }
//    }
}

class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float [] arr1=new float[3];
for (int i=0;i<arr1.length;i++){
    if(i<2){
        arr1[i]=getXY()[i];
    }else {
        arr1[i]=z;
    }
}
        return arr1;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập x");
        float x=sc.nextFloat();
        System.out.println("nhập y");
        float y=sc.nextFloat();
        System.out.println("nhập z");
        float z=sc.nextFloat();
        Point3D point3D=new Point3D(x,y,z);
        System.out.println("mảng của point3D");
        System.out.print(point3D.toString());
        System.out.println();
        Point2D point2D=new Point2D(x,y);
        System.out.println("mảng của point2D");
            System.out.print(point2D.toString());

    }
}