package AdvancedDS.Stack;

import java.util.Stack;

public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    CustomStack(){
        this(DEFAULT_SIZE);
    }
    CustomStack(int size){
        this.data = new int[size];
    }
    private boolean push(int item) throws Exception {
        if (isFull()){
            throw new Exception("stack overflow");
            //return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    private boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
    private int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int removed = data[ptr];
        data[ptr] = '\0';
        ptr--;
        return removed;
    }
    private void display(){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        //Stack<Integer> stack = new Stack<>();
        CustomStack stack = new CustomStack(5);
        stack.push(21);
        stack.push(23);
        stack.push(25);
        stack.push(27);
        stack.push(29);
        stack.pop();
        stack.pop();
        stack.display();
    }
}
