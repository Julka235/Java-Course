package org.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtractionTest {
    @Test
    void shouldReturnDifferenceOfTwoValues() {
        // given
        int firstValue = 16;
        int secondValue = 9;
        Subtraction subtraction = new Subtraction();
        // when
        int difference = subtraction.compute(firstValue, secondValue);
        // then
        Assertions.assertEquals(7, difference);
    }
}