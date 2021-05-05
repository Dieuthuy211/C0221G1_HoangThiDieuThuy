package thuc_hanh.comparable;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle();
        circles[1]=new ComparableCircle(5);
        circles[2]=new ComparableCircle(3,"red");
        for (ComparableCircle comparableCircle : circles){
            System.out.println(comparableCircle);
        }
    }
}
