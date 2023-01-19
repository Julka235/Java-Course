package org.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisionTest {
    @Test
    void shouldReturnQuotientOfTwoValues() {
        // given
        int firstValue = 24;
        int secondValue = 4;
        Division division = new Division();
        // when
        int quotient = division.compute(firstValue, secondValue);
        // then
        Assertions.assertEquals(6, quotient);
    }
}