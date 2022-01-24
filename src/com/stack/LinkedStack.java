package com.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private final LinkedList<Product> stack;

    public LinkedStack(){
        stack = new LinkedList<Product>();
    }

    public void push (Product product){
        stack.push(product);
    }

    public Product pop(){
        return stack.pop();
    }

    public Product peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        ListIterator<Product> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
