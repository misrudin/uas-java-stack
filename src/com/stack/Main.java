package com.stack;

public class Main {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        Product kaos = new Product(1, "Kaos", 100000);
        Product kemeja = new Product(2, "Kemeja", 150000);
        Product sepatu = new Product(3, "Sepatu", 200000);
        Product topi = new Product(4, "Topi", 100000);

        stack.push(kaos);
        stack.push(kemeja);
        stack.push(sepatu);
        stack.push(topi);

        System.out.println("INITIAL DATA");
        stack.printStack();

        stack.pop();

        System.out.println("DATA AFTER POP");
        stack.printStack();

        System.out.print("STACK SIZE = ");
        System.out.println(stack.size());
    }
}
