package baitap.Fan;

public class Fan {
    public final int SLOW = 1;
    public final int FAST = 3;
    public final int MEDIUM = 2;
    private int speed = SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
       if(on){
           return "Fan{" +
                   "speed=" + speed +
                   ", on=" + on +
                   ", radius=" + radius +
                   ", color='" + color + '\'' +
                   '}';
       }else {
           return "Fan{" +
                   ", on=" + on +
                   ", radius=" + radius +
                   ", color='" + color + '\'' +
                   '}';
       }
    }

}
