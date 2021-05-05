package bai_tap.MyList;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    //tạo ra contructor k tham số với sức chứa mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//tạo ra contructor với sức chứa được truyền vào
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException(" nhập vào không đúng " + capacity);
        }
    }

    public int size() {
        return this.size;
    }
//xóa list
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
//thêm 1 phần tử cuối mảng
    public boolean add(E element) {
        if (size == elements.length) {
            this.ensureCapacity(1);
            elements[size] = element;
            size++;
        }
        elements[size] = element;
        size++;
        return true;
    }
// thêm độ dài mảng
    public void ensureCapacity(int minCapacity) {
        if(minCapacity>=0){
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
        }else{ throw new IllegalArgumentException("min capacity");}
    }
//    thêm phần tử vào 1 vị trí bất kì
    public void add(E element,int index){
        if(index>elements.length){
            throw new IllegalArgumentException("index sai");
        }else if(elements.length==size){
          this.ensureCapacity(5);
        }
        if(elements[index]==null){
            elements[index]=element;
            size++;
        }else {
            for(int i=size;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
//    lấy ra 1 phần tử của mảng
    public E get(int index){
        return (E) elements[index];
    }

//    tìm xem 1 phần tử có thuộc vào trong mảng không trả về chỉ số đầu tiên
    public int indexOf(E element){
        int index=-1;
      for(int i=0;i<size;i++){
          if(this.elements[i].equals(element)){
              return i;
          }
      }
      return index;
    }
//    tìm 1 phần tử có thuộc mảng k
public boolean contains(E element){
        return this.indexOf(element)>0;
}
//sao chép list
public MyList<E> clone(){
        MyList<E> v=new MyList<>();
        v.elements=Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
}
//xóa 1 phần tử bất kì
public E remove(int index){
        if(index<0||index>elements.length){
            throw new IllegalArgumentException("index sai");
        }
        E element= (E) elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
}

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }

//    @Override
//    public String toString() {
//        return "elements=" + Arrays.toString(elements) ;
//    }
}
