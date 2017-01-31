package StacksQueues;
import java.util.*;
public class Q3o2 extends MyStack<Integer>{
    MyStack<Integer> s2;
    public Q3o2(){
        s2 = new MyStack<Integer>();
    }

    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else{
            return s2.peek();
        }
    }

    public void push(int val){
        if(val<=min()){
            s2.push(val);
            System.out.println("min stack top "+s2.peek());
        }
        super.push(val);
        System.out.println("super top "+super.peek());
    }

    public Integer pop(){
        int val = super.pop();
        if(val==min()){
            s2.pop();
        }
        return val;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Q3o2 q = new Q3o2();
        q.push(2);
        int ans;
        ans = q.min();
        System.out.println("min is "+ans);
        q.push(6);
        ans = q.min();
        System.out.println("min is "+ans);
        q.push(1);
        ans = q.min();
        System.out.println("min is "+ans);
        ans = q.pop();
        System.out.println("popped "+ans);
        ans = q.min();
        System.out.println("min is "+ans);
        q.push(3);
        ans = q.min();
        System.out.println("min is "+ans);
        q.push(5);
        ans = q.min();
        System.out.println("min is "+ans);
        ans = q.pop();
        System.out.println("popped "+ans);
        ans = q.min();
        System.out.println("min is "+ans);
    }
}
