package baitap.baitapRectangle;

public class ResizeableTest {
    public static void main(String[] args) {
//        ReCircle reCircle = new ReCircle();
//        reCircle.reSize(3);
//        System.out.println(reCircle);
        Shape7th[] shape = new Shape7th[3];
        shape[0] = new Square7th();
        shape[1] = new Rectangle7th();
        shape[2] = new Circle7th();
        System.out.println("diện tích ban đầu của mảng");
        for (Shape7th shape1:shape){
            System.out.println(shape1);
        }
        System.out.println("diện tích sau khi tăng phần trăm theo tỉ lệ ngẩu nhiên");
        for (Shape7th shape1:shape){
            shape1.reSize(Math.random()*100);
            System.out.println(shape1);
        }
    }
}
