package StacksQueues;
import java.util.*;
public class Q3o3 {
    List<MyStack> setOfStacks = new ArrayList<>();

    private void display(){
        for(int i = 0; i< setOfStacks.size(); i++){
            System.out.println("top is "+ setOfStacks.get(i).peek()+" and size of stack is "+ setOfStacks.get(i).capacity);
        }
    }
    private void pushstack(int val, int cap){
        MyStack<Integer> stack;
        if(setOfStacks.isEmpty()){
            stack = new MyStack<>();
            setOfStacks.add(stack);
            stack.push(val);
        }
        else{
            stack = setOfStacks.get(setOfStacks.size()-1);
            if(stack.capacity<cap){
                stack.push(val);
            }
            else{
                stack = new MyStack<>();
                setOfStacks.add(stack);
                stack.push(val);
            }
        }
    }

    public int popstack(){
        MyStack<Integer> stack;
        if(setOfStacks.isEmpty()){
            System.out.println("no stack found");
            return 0;
        }
        stack = setOfStacks.get(setOfStacks.size()-1);
        int popped = stack.pop();
        //remove empty stack from the set of stacks
        for(int i=0;i<setOfStacks.size();i++){
            if(setOfStacks.get(i).capacity==0){
                setOfStacks.remove(i);
            }
        }
        return popped;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int capacity = s.nextInt();
        Q3o3 q = new Q3o3();
        q.pushstack(5,capacity);
        q.pushstack(3,capacity);
        q.pushstack(2,capacity);
        q.pushstack(5,capacity);
        q.pushstack(1,capacity);
        q.pushstack(4,capacity);
        q.display();
        int d = q.popstack();
        System.out.println("popped is "+d);
        q.display();
        d = q.popstack();
        System.out.println("popped is "+d);
        q.display();
        d = q.popstack();
        System.out.println("popped is "+d);
        q.display();
        d = q.popstack();
        System.out.println("popped is "+d);
        q.display();
        d = q.popstack();
        System.out.println("popped is "+d);
        q.display();

    }
}
