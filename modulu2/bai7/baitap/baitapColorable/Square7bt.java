package baitap.baitapColorable;

public class Square7bt extends Shape7bth {
    double side=1.0;
    public Square7bt(double v, String color, boolean b) {
        super(color,b);
        this.side=v;
    }
    public Square7bt() {
    }

    public Square7bt(double v) {
        this.side=v;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getAge(){
        return side*side;
    }
    @Override
    public String toString() {
        return "Square{" +
               " diện tích hình vuông ="+getAge()+
                ", color =" + getColor()+
                '}';
    }
}
