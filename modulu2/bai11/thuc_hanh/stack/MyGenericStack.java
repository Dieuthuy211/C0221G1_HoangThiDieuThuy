package thuc_hanh.stack;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if(isEmpty()){
           throw new IllegalArgumentException("không có phần tử để xóa");
        }else {
           return stack.removeFirst();
        }
    }

    boolean isEmpty() {
        if(size()==0){
            return true;
        }else {
            return false;
        }
    }
    public int size(){
        return stack.size();
    }
}
