package org.kata.training;

public class Stack {
    private int size = 0;
    private int[] element = new int[5];


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {

        try {
            this.element[size++] = element;

        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new Overflow();
        }
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

    public void setMaxElements(int maxElements) {
        this.element = new int[maxElements];
    }

    public int getMaxElements() {
        return element.length;
    }


    public class Underflow extends RuntimeException {
    }

    public class Overflow extends RuntimeException {
    }
}
