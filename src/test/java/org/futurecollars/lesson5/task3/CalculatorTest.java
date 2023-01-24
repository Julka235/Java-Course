package org.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {
    @ParameterizedTest
    @CsvSource(value = {"2:+:3:5", "4:-:3:1", "3:*:2:6", "18:/:6:3"}, delimiter = ':')
    void shouldReturnTheResultOfTheOperation(int firstValue, char operationSign, int secondValue, int expected) {
        // given
        Operation[] operations = { new Addition(), new Subtraction(), new Multiplication(), new Division() };
        Calculator calculator = new Calculator(operations);
        // when
        int value = calculator.compute(firstValue, operationSign, secondValue);
        // then
        Assertions.assertEquals(expected, value);
    }
}