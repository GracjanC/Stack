package com.gracjan;

public class Stack<T> {
    private T[] array;
    private int size;
    private int top = -1;

    public Stack(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    public void push(T data) {

        if (this.top + 1 < this.size) {
            this.top++;
            this.array[top] = data;
        } else {
            System.out.println("StackOverflow!");
        }
    }

    public void pop() {
        if (top >= 0) {
            this.array[top] = null;
            this.top--;

        } else {
            System.out.println("Nothing to remove!");
        }
    }

    public T peek() {
        return this.array[top];
    }

    public void display() {
        for (T item : this.array) {
            System.out.println(item);
        }
    }
}
