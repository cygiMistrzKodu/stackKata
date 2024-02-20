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

    }

    @Test
    public void afterOnePushAndOnePop_isEmpty() {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
