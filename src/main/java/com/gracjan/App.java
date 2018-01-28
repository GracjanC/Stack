package com.gracjan;

public class App 
{
    public static void main( String[] args ) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.display();
        System.out.println();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println("pop");
        System.out.println(stack.peek());
        System.out.println();
        stack.display();
        System.out.println();
        System.out.println("pop");
        stack.pop();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();
        stack.display();
    }
}
