package thuc_hanh.myList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public void MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public void add(int element) {
//        if (size == elements.length) {
//            esureCapa();
//            elements[size] = element;
//            size++;
//        }
        elements[size] = element;
        size++;
    }

    private void esureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

}
