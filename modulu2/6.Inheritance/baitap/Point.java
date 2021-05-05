package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Point {
    float x;
    float y;

    public Point() {
    }

    public Point(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}

class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr1 = new float[2];
        arr1[0] = xSpeed;
        arr1[1] = ySpeed;
        return arr1;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY()) + "speed = " + Arrays.toString(getSpeed());
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x");
        float x = sc.nextFloat();
        System.out.println("nhập y");
        float y = sc.nextFloat();
        System.out.println("nhập xs");
        float xs = sc.nextFloat();
        System.out.println("nhập ys");
        float ys = sc.nextFloat();
        MoveablePoint moveablePoint = new MoveablePoint(x, y, xs, ys);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
        Point point = new Point(x, y);
        System.out.println("point = " + point.toString());


    }
}