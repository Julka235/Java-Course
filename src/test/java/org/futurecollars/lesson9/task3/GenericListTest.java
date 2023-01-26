package org.futurecollars.lesson9.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericListTest {

    @Test
    void shouldReturnListSize() {
        // given
        OwnList<Integer> genericList = new GenericList<>();
        genericList.add(1);
        genericList.add(2);
        genericList.add(3);
        // when
        int size = genericList.size();
        // then
        Assertions.assertEquals(3, size);
    }

    @Test
    void shouldAddElement() {
        // given
        OwnList<Integer> genericList = new GenericList<>();
        genericList.add(1);
        genericList.add(2);
        genericList.add(3);
        genericList.add(4);
        genericList.add(5);
        genericList.add(6);
        genericList.add(7);
        genericList.add(8);
        genericList.add(9);
        genericList.add(10);
        genericList.add(11);
        // when
        int value = genericList.get(10);
        // then
        Assertions.assertEquals(11, value);
    }

    @Test
    void shouldReturnTrueWhenAddedElement() {
        // given
        OwnList<Integer> genericList = new GenericList<>();
        // when
        boolean isAdded = genericList.add(1);
        // then
        Assertions.assertTrue(isAdded);
    }

    @Test
    void shouldRemoveElement() {
        OwnList<Integer> genericList = new GenericList<>();
        genericList.add(1);
        genericList.add(2);
        genericList.add(3);
        genericList.remove(2);
        Assertions.assertEquals(3, genericList.get(1));
    }

    @Test
    void shouldReturnTrueWhenRemovedElement() {
        // given
        OwnList<Integer> genericList = new GenericList<>();
        genericList.add(1);
        genericList.add(2);
        // when
        boolean isRemoved = genericList.remove(2);
        Assertions.assertTrue(isRemoved);
    }

    @Test
    void shouldReturnFalseWhenDidNotRemoveElement() {
        // given
        OwnList<Integer> genericList = new GenericList<>();
        genericList.add(1);
        genericList.add(2);
        // when
        boolean isRemoved = genericList.remove(3);
        Assertions.assertFalse(isRemoved);
    }
}