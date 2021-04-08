package baitap.baitapRectangle;

public class Circle7th extends Shape7th {
    private double radius = 1.0;
    private String color = "red";

    public Circle7th() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle7th(double radius) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle7th(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    double getArea() {
        final double PI = 3.14;
        return PI * PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " diện tích hinh tròn " + getArea() +
                '}';
    }

    @Override
    public void reSize(double percent) {
        super.reSize(percent);
        setRadius(getRadius()+(getRadius()*percent/100));
    }
}
