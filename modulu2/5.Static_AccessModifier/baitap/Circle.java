package baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
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
                "radius=" + radius +
                ", color='" + color + '\'' +
                "diện tích hinh tròn =" + getArea() +
                '}';
    }

//    public static void main(String[] args) {
//        Circle circle1 = new Circle(2, "red");
//        System.out.println(circle1.getRadius());
//        System.out.println("diện tích hinh tròn là " + circle1.getArea());
//    }
}
