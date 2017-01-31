package StacksQueues;

import java.util.EmptyStackException;

public class MyStack<T> {
    public Node<T> top;
    int capacity;

    public MyStack(){
        capacity = 0;
    }

    public T pop(){
        if(top==null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        capacity--;
        return item;
    }

    public void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
        capacity++;
    }

    public T peek(){
        if(top==null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void display(){
        if(top==null) return;
        System.out.println(top.data);
        T n = pop();
        display();
        push(n);
    }
}
