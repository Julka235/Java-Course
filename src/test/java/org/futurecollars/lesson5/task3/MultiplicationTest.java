package org.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    @Test
    void shouldReturnProductOfTwoValues() {
        // given
        int firstValue = 8;
        int secondValue = 3;
        Multiplication multiplication = new Multiplication();
        // when
        int product = multiplication.compute(firstValue, secondValue);
        // then
        Assertions.assertEquals(24, product);
    }
}