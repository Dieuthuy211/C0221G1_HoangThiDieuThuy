package baitap;

public class BaiTap3 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST,true,10,"yellow");
        Fan fan2 = new Fan(Fan.MEDIUM,false,5,"blue");
        String status_fan1 = fan1.toString();
        System.out.println(status_fan1);
    }

    public static class Fan{
        private static final int SLOW = 1;
        private static final int MEDIUM = 2;
        private static final int FAST = 3;
        private int speed = 1;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public Fan(){}

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public static int getSLOW() {
            return SLOW;
        }

        public static int getMEDIUM() {
            return MEDIUM;
        }

        public static int getFAST() {
            return FAST;
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
            if (on == true) {
                return "Fan{" +
                        "speed=" + speed +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        ", fan is on}";
            }
            else {
                return "Fan{" +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        ", fan is off}";
            }
        }
    }
}
