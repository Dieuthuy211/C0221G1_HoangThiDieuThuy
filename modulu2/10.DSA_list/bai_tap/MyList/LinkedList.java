package bai_tap.MyList;

import thuc_hanh.myList.MyLinkedList;

public class LinkedList<E> {
    public void add(E charAt) {
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    private Node head;
    private int numNodes;

    public LinkedList() {
    }
    public void addFirst(E element){
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        numNodes++;
    }
    public void addLast(E element) {
        Node temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
    public void add(int index,E element){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public int size() {
        return numNodes;
    }
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element))
                return i;
            temp = temp.next;
        }
        return -1;
    } public E remove(int index){
        if (index<0||index>numNodes){
            throw new IndexOutOfBoundsException();
        }
        Node temp=head;
        Object data;
        if (index==0){
            data=temp.data;
            head=head.next;
        }else{
            for (int i = 0; i <index-1&&temp.next!=null ; i++) {
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
        }
        numNodes--;
        return (E)data;
    }
    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp=head;
            while (temp.next!=null){
                if (temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
    }
    public LinkedList<E>clone(){
        if (numNodes==0){
            throw new NullPointerException();
        }
        LinkedList<E> temp = new LinkedList<E>();
        Node tempNode=head;
        temp.addFirst((E) tempNode.data);
        tempNode=tempNode.next;
        while (tempNode!=null){
            temp.addLast((E) tempNode.data);
            tempNode=tempNode.next;
        }return temp;
    }
    public void printList(){
        Node temp = head ;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next ;
        }
    }
    }