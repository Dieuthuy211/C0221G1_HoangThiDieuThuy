package bai_tap.dao_phan_tu_stack;

import java.util.LinkedList;

public class MyStack<N> {
    private LinkedList<N> stack;
    public MyStack(){
        stack=new LinkedList<>();
    }
    public void push(N element){
        stack.addFirst(element);
    }
    public N pop(){
        if(size()==0){
            throw new IllegalArgumentException("không có phần tử dể xóa");
        }else {
            return stack.removeFirst();
        }
    }
    public int size(){
        return stack.size();
    }

}
