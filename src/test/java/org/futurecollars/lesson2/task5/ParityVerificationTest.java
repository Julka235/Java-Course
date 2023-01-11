package org.futurecollars.lesson2.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParityVerificationTest {
    @Test
    void shouldReturnTrueWhenEven() {
        // given
        int number = 12;
        // when
        boolean isEven = ParityVerification.isEven(number);
        // then
        Assertions.assertTrue(isEven);
    }

    @Test
    void shouldReturnFalseWhenOdd() {
        // given
        int number = 7;
        // when
        boolean isEven = ParityVerification.isEven(number);
        // then
        Assertions.assertFalse(isEven);
    }

    @Test
    void shouldReturnTrueWhenOdd() {
        // given
        int number = 13;
        // when
        boolean isOdd = ParityVerification.isOdd(number);
        // then
        Assertions.assertTrue(isOdd);
    }

    @Test
    void shouldReturnFalseWhenEven() {
        // given
        int number = 8;
        // when
        boolean isOdd = ParityVerification.isOdd(number);
        // then
        Assertions.assertFalse(isOdd);
    }
}