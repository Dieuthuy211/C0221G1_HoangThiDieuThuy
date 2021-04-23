package bai_tap.tam_giac;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }
    public Triangle(int a, int b, int c) throws IllegalAccessException {
        if(a<=0||a>(b+c)){
            throw new IllegalAccessException("a");
        }else if(b<=0||b>(a+c)){
            throw new IllegalAccessException("b");
        }else if(c<=0||c>(a+b)){
            throw new IllegalAccessException("c");
        }else {
            this.a=a;
            this.b=b;
            this.c=c;
        }

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
