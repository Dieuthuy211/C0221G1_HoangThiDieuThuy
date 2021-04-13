package bai_tap.dao_phan_tu_stack;

public class Stack {
    private static void stackOfIntegers( int arrayInterger[]){
        MyStack<Integer> stack=new MyStack<>();
        for(int i=0;i<arrayInterger.length;i++){
            stack.push(arrayInterger[i]);
        }
        for (int i=0;i<arrayInterger.length;i++){
            arrayInterger[i]=stack.pop();
        }
        for (int i=0;i<arrayInterger.length;i++){
            System.out.println(arrayInterger[i]);
        }

    }
    private static void stackOfString(String arrayString[]){
        MyStack<String> stack=new MyStack<>();
        for(int i=0;i<arrayString.length;i++){
            stack.push(arrayString[i]);
        }
        for (int i=0;i<arrayString.length;i++){
            arrayString[i]=stack.pop();
        }
        for (int i=0;i<arrayString.length;i++){
            System.out.println(arrayString[i]);
        }
    }
    public static void main(String[] args) {
        int arrayInterger[]={1,2,3,4,5};
        Stack.stackOfIntegers(arrayInterger);
        String arrayString[]={"lan","ngọc","minh","vân"};
        Stack.stackOfString(arrayString);
    }
}
