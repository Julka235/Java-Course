package org.futurecollars.lesson8.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IntegerListTest {

    @Test
    void shouldReturnEmptyWhenListIsEmpty() {
        // given
        IntegerList integerList = new IntegerList();
        // when
        integerList.add(1);
        integerList.remove(0);
        // then
        Assertions.assertTrue(integerList.isEmpty());
    }

    @Test
    void shouldAddElementAtTheEndOfTheList() {
        // given
        int element = 1;
        IntegerList integerList = new IntegerList();
        // when
        integerList.add(element);
        // then
        Assertions.assertEquals(element, integerList.get(0));
    }

    @Test
    void shouldAddElementUnderIndex() {
        // given
        int element = 2;
        int index = 1;
        IntegerList integerList = new IntegerList();
        integerList.add(1);
        integerList.add(3);
        // when
        integerList.add(index, element);
        // then
        Assertions.assertEquals(element, integerList.get(index));
    }

    @Test
    void shouldRemoveElementFromIndex() {
        // given
        int index = 1;
        IntegerList integerList = new IntegerList();
        integerList.add(1);
        integerList.add(3);
        // when
        integerList.remove(index);
        // then
        Assertions.assertEquals(1, integerList.get(integerList.size() - 1));
    }
}