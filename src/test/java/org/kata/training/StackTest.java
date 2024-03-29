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
        assertEquals(1, stack.getSize());

    }

    @Test
    public void afterOnePushAndOnePop_isEmpty() {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void afterTwoPushes_sizeIsTwo() {
        stack.push(0);
        stack.push(0);
        assertEquals(2, stack.getSize());
    }

    @Test
   public void poppingEmptyStack_throwsUnderflow() {
        assertThrows(Stack.Underflow.class,
                () -> {
                    stack.pop();
                });

    }

    @Test
    public void afterPushingX_willPopX() {
        stack.push(99);
        assertEquals(99,stack.pop());
        stack.push(88);
        assertEquals(88,stack.pop());
    }

    @Test
    public void afterPushingXandY_willPopYthenX() {
        stack.push(99);
        stack.push(88);
        assertEquals(88,stack.pop());
        assertEquals(99,stack.pop());

    }

    @Test
    public void setNumberOfElementsInStack() {
        stack.setMaxElements(6);
        assertEquals(6,stack.getMaxElements());
        stack.setMaxElements(8);
        assertEquals(8,stack.getMaxElements());
    }

    @Test
    public void defaultMaxElementInStackIs5() {
        assertEquals(5,stack.getMaxElements());
    }

    @Test
    public void byDefaultCanInsert5ElementsOnStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5,stack.getMaxElements());
    }

    @Test
    public void pushingMoreThrowOverflow() {
        assertThrows(Stack.Overflow.class,
                () -> {
                    stack.push(1);
                    stack.push(2);
                    stack.push(3);
                    stack.push(4);
                    stack.push(5);
                    stack.push(6);
                });
    }

    @Test
    public void elementsStillPresentIfChangingCapacity() {
        stack.push(9);
        stack.setMaxElements(3);

        assertEquals(9,stack.pop());
    }

    @Test
    public void ifsetLessCapacityThanInOldStackPresentThenTheMostRecentAreRemoved() {
        stack.push(3);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.setMaxElements(2);
        assertEquals(6, stack.pop());

    }
}
