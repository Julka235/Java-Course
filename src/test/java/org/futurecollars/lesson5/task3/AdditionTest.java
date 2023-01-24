package org.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdditionTest {
    @Test
    void shouldReturnSumOfTwoValues() {
        // given
        int firstValue = 4;
        int secondValue = 7;
        Addition addition = new Addition();
        // when
        int sum = addition.compute(firstValue, secondValue);
        // then
        Assertions.assertEquals(11, sum);
    }
}