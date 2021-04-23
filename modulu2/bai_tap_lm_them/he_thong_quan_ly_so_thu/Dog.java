package he_thong_quan_ly_so_thu;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, String description) {
        super(name, age, description);
    }

    @Override
    void showSound() {
        System.out.println("gâu gâu");
    }
}
