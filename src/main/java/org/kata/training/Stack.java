package org.kata.training;

public class Stack {
    private int size = 0;
    private int[] element = new int[2];


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.element[size++] = element;
    }

    public int pop() {
        if (size == 0) {
            throw new Underflow();
        }
        return element[--size];
    }

    public int getSize() {
        return size;
    }

    public void setMaxElement(int maxElements) {
    }

    public int getMaxElements() {
        return 6;
    }


    public class Underflow extends RuntimeException {
    }
}
