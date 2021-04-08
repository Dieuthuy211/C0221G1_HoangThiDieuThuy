package baitap.baitapRectangle;

public class Square7th extends Shape7th {
    double side = 1.0;

    public Square7th(double v, String color, boolean b) {
        super(color, b);
        this.side = v;
    }

    public Square7th() {
    }


    public Square7th(double v) {
        this.side = v;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getAge() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                " diện tích hinh vuông " + getAge() +
                '}';
    }

    @Override
    public void reSize(double percent) {
        super.reSize(percent);
        setSide(getSide() + (getSide() * percent / 100));
    }
}
