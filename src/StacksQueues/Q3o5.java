package StacksQueues;
import java.util.*;
public class Q3o5 {
    MyStack<Integer> temp;

    public Q3o5(){
        temp = new MyStack<>();
    }

    private MyStack<Integer> sortStack(MyStack<Integer> stack){
        while(!stack.isEmpty()){
            int val = stack.pop();
            while(!temp.isEmpty() && temp.peek()>val){
                stack.push(temp.pop());
            }
            temp.push(val);
        }
        return temp;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();
        Q3o5 q = new Q3o5();
        System.out.println("How many elements you want to push?");
        int n = s.nextInt();
        while(n>0){
            stack.push(s.nextInt());
            n--;
        }
        MyStack<Integer> ans = q.sortStack(stack);
        ans.display();
    }
}
