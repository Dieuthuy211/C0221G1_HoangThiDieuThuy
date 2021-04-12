package thuc_hanh.myList;

public class MyLinkedList {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    //    khai báo danh sach liên kết
    private Node head;
    //    khai báo số lượng phần tử trong danh sách
    private int numNodes = 0;
//    tạo ra 1 contructor không tham số

    public MyLinkedList() {
    }

    //    tao 1
    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    //thêm đối tượng vào đầu tiên
    public void addFirst(Object data) {
        Node tem = head;
        head = new Node(data);
        head.next = tem;
        numNodes++;
    }

    //thêm đối tượng vào 1 vị trí bất kì
    public void add(Object data, int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;

    }

    //    lấy ra phần tử ở vị trí bất kì
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //  hiển thị danh sách các phần tử
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
