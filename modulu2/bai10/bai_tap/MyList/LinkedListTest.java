package bai_tap.MyList;

public class LinkedListTest {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addFirst(7);
//        list.addFirst(5);
//        list.addFirst(6);
//        list.add(7,9);
//        list.addLast(8);
//        list.printList();
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return ("id " + id + ", tên " + name);
            }
        }
        Student a = new Student(1, "trang");
        Student b = new Student(2, "trung");
        Student c = new Student(3, "linh");
        Student d = new Student(4, "hung");
        Student e = new Student(5, "hoa");
        Student f = new Student(6, "dủng");
        LinkedList<Student> list = new LinkedList<>();

        list.addFirst(a);
        list.addFirst(b);
        list.addFirst(c);
        list.addFirst(d);
        list.addFirst(e);
        for(int i=0;i<list.size();i++){
            System.out.println( ((Student) list.get(i)).getName());
        }
    }
}
