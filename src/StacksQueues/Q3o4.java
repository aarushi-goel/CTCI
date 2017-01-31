package StacksQueues;
import java.util.*;
public class Q3o4 {
    MyStack<Integer> stack1;
    MyStack<Integer> stack2;

    public Q3o4(){
        stack1 = new MyStack<>();
        stack2 = new MyStack<>();
    }

    private void enQueue(int val){
        stack1.push(val);
    }

    private int deQueue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    private int peekQueue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    private int sizeQueue(){
        return stack1.capacity+stack2.capacity;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Q3o4 q = new Q3o4();
        q.enQueue(s.nextInt());
        q.enQueue(s.nextInt());
        q.enQueue(s.nextInt());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(s.nextInt());
        System.out.println(q.peekQueue());
        System.out.println(q.sizeQueue());
    }

}
