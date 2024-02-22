package org.kata.training;

public class Stack {
    private int size = 0;
    private int[] elements = new int[5];


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {

        if (size >= this.elements.length) {
            throw new Overflow();
        } else {
            this.elements[size++] = element;
        }


    }

    public int pop() {
        if (size == 0) {
            throw new Underflow();
        }
        return elements[--size];
    }

    public int getSize() {
        return size;
    }

    public void setMaxElements(int maxElements) {

        int[] oldStack = this.elements;
        this.elements = new int[maxElements];

        int elementToCopy = Math.min(oldStack.length, maxElements);
        System.arraycopy(oldStack, 0, this.elements, 0, elementToCopy);

        if (isStackCapacitySmallerThanPreviousOne()) {
            this.size = this.elements.length;
        }
    }

    private boolean isStackCapacitySmallerThanPreviousOne() {
        return this.elements.length < this.size;
    }

    public int getMaxElements() {
        return elements.length;
    }


    public class Underflow extends RuntimeException {
    }

    public class Overflow extends RuntimeException {
    }
}
