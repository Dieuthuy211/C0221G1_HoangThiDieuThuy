package he_thong_quan_ly_so_thu;

public class Cat{
//    public Cat() {
//    }
//
//    public Cat(String name, int age, String description) {
//        super(name, age, description);
//    }
//
//    @Override
//    void showSound() {
//        System.out.println("meo meo");
//    }
public static void main(String args[]){
    try {
        int x = 0;
        int y = 5 / x;
    }catch (ArithmeticException e) {
        System.out.println("Arithmetic");
    }catch (Exception ae) {
        System.out.println("Exception");
    }
    System.out.println("finished");
}
}

