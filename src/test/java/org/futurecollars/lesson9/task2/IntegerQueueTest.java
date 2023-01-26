package org.futurecollars.lesson9.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerQueueTest {

    @Test
    void shouldReturnTrueWhenAddedElement() {
        // given
        OwnQueue integerQueue = new IntegerQueue();
        // when
        boolean isAdded = integerQueue.add(1);
        // then
        Assertions.assertTrue(isAdded);
    }

    @Test
    void ShouldRemoveTheHeadAndReturnItsValue() {
        // given
        OwnQueue integerQueue = new IntegerQueue();
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.remove();
        // when
        Integer value = integerQueue.remove();
        Assertions.assertEquals(3, value);
    }

    @Test
    void shouldReturnValueOfTheHead() {
        // given
        OwnQueue integerQueue = new IntegerQueue();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.remove();
        // when
        Integer value = integerQueue.element();
        // then
        Assertions.assertEquals(2, value);
    }
}