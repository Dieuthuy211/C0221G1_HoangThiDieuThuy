package baitap.baitapColorable;

public class Rectangle7bt extends Shape7bth {
    double width = 1.0;
    double height = 1.0;

    public Rectangle7bt() {
    }

    public Rectangle7bt(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle7bt(double width, double heigth, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = heigth;
    }


    protected double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    protected double getHeight() {
        return height;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        String s = "Rectangle{" +
                " diện tích hình chữ nhật =" + height +
                ", color='" + getColor() + '\'' +
                '}';
        return s;
    }
}

