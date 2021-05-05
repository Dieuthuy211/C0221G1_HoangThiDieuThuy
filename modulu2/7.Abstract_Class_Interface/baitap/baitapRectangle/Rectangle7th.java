package baitap.baitapRectangle;

public class Rectangle7th extends Shape7th {
    double width = 1.0;
    double height = 1.0;

    public Rectangle7th() {
    }

    public Rectangle7th(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle7th(double width, double heigth, String color, boolean filled) {
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
                " diện tích chữ nhật "+getArea()
                +
                '}';
        return s;
    }

    @Override
    public void reSize(double percent) {
        super.reSize(percent);
        setWidth(getWidth()+(getWidth()*percent/100));
        setHeight(getHeight()+(getHeight()*percent/100));
    }
}

