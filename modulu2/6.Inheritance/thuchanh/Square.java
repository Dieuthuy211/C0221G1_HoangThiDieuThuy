package thuchanh;

public class Square extends Shape {
    double side=1.0;
    public Square(double v, String yellow, boolean b) {
        super(yellow,b);
        this.side=v;
    }
    public Square() {
    }

    public  Square(double v) {
        this.side=v;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + getColor()+ '\'' +
                ", filled=" + isFilled() +
                '}';
    }
}
class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
