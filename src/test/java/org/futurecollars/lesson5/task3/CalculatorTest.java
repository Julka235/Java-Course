package org.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        // given
        int firstValue = 7;
        int secondValue = 5;
        // when
        int sum = Calculator.add(firstValue, secondValue);
        // then
        Assertions.assertEquals(12, sum);
    }

    @Test
    void shouldSubtractOneValueFromTheOther() {
        // given
        int firstValue = 10;
        int secondValue = 3;
        // when
        int difference = Calculator.subtract(firstValue, secondValue);
        // then
        Assertions.assertEquals(7, difference);
    }

    @Test
    void shouldMultiplyTwoValues() {
        // given
        int firstValue = 6;
        int secondValue = 4;
        // when
        int product = Calculator.multiply(firstValue, secondValue);
        // then
        Assertions.assertEquals(24, product);
    }

    @Test
    void shouldDivideOneValueByTheOther() {
        // given
        int firstValue = 9;
        int secondValue = 3;
        // when
        int quotient = Calculator.divide(firstValue, secondValue);
        // then
        Assertions.assertEquals(3, quotient);
    }
}