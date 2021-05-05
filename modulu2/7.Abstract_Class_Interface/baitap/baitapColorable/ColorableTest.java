package baitap.baitapColorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape7bth[] shape=new Shape7bth[3];
        shape[0]=new Square7bt();
        shape[1]=new Rectangle7bt();
        shape[2]=new Circle7bt();
        for(Shape7bth shape1: shape){
           if(shape1 instanceof Colorable){
               System.out.println(shape1);
               shape1.howToColor();
           }else {
               System.out.println(shape1);
           }
        }

    }
}
