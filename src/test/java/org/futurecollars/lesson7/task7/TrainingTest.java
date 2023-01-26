package org.futurecollars.lesson7.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrainingTest {
    @ParameterizedTest
    @CsvSource(value = {"20:200:120:Low", "25:250:160:Good", "25:200:180:Very good", "90:500:190:Perfect"}, delimiter = ':')
    void shouldReturnEffectivityDescription(double duration, double calories, double pulse, String expected) {
        Assertions.assertEquals(expected, Training.getEffectivityDescription(duration, calories, pulse));
    }
}