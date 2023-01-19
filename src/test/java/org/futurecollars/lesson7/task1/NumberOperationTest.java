package org.futurecollars.lesson7.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberOperationTest {
    @ParameterizedTest(name = "Verifying number {0} is even")
    @ValueSource(ints = {4, 16, 26})
    void shouldReturnTrueWhenEven(int number) {
        Assertions.assertTrue(NumberOperation.isEven(number));
    }

    @ParameterizedTest(name = "Verifying number {0} is not even")
    @ValueSource(ints = {7, 23, 101})
    void shouldReturnFalseWhenNotEven(int number) {
        Assertions.assertFalse(NumberOperation.isEven(number));
    }

    @ParameterizedTest(name = "Should return sum of digits in the number.")
    @CsvSource(value = {"436:13", " 395:17", "5702137:25"}, delimiter = ':')
    void shouldReturnSumOfDigitsInTheNumber(int number, int expectedNumber) {
        Assertions.assertEquals(expectedNumber, NumberOperation.sumOfDigits(number));
    }
}