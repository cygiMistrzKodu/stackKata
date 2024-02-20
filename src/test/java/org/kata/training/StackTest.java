package org.kata.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack = new Stack();

    @Test
    public void canCreateStack() {
        assertTrue(stack.isEmpty());


    }

    @Test
    public void afterOnePush_isNotEmpty() {

        stack.push(0);
        assertFalse(stack.isEmpty());
        assertEquals(1,stack.getSize());

    }

    @Test
    public void afterOnePushAndOnePop_isEmpty() {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0,stack.getSize());
    }

    @Test
    public void afterTwoPushes_sizeIsTwo() {
        stack.push(0);
        stack.push(0);
        assertEquals(2, stack.getSize());
    }


}
