package baitap;

public class Circle {
    public double radius = 1.0;
    public String color = "red";

    public Circle() {
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

    double getRadius() {
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

    public static void main(String[] args) {
        Circle circle1 = new Circle(2, "red");
        System.out.println(circle1.getRadius());
        System.out.println("diện tích hinh tròn là " + circle1.getArea());
    }
}
