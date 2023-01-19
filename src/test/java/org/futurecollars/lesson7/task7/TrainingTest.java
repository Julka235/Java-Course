package org.futurecollars.lesson7.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrainingTest {
    @ParameterizedTest
    @CsvSource(value = {"20:1", "30:2", "40:2", "60:2", "70:3"}, delimiter = ':')
    void shouldReturnDurationEffectivity(double duration, int expected) {
        Assertions.assertEquals(expected, Training.getDurationEffectivity(duration));
    }

    @ParameterizedTest
    @CsvSource(value = {"200:1", "300:1", "350:2", "400:3", "500:3"}, delimiter = ':')
    void shouldReturnBurnedCaloriesEffectivity(double calories, int expected) {
        Assertions.assertEquals(expected, Training.getCaloriesEffectivity(calories));
    }

    @ParameterizedTest
    @CsvSource(value = {"100:1", "160:2", "170:2", "175:2", "190:3"}, delimiter = ':')
    void shouldReturnAveragePulseEffectivity(double pulse, int expected) {
        Assertions.assertEquals(expected, Training.getPulseEffectivity(pulse));
    }

    @ParameterizedTest
    @CsvSource(value = {"20:200:120:1.0","25:250:160:1.5", "25:200:180:2.0", "90:500:190:3.0"}, delimiter = ':')
    void shouldReturnEffectivity(double duration, double calories, double pulse, double expected) {
        Assertions.assertEquals(expected, Training.getEffectivity(duration, calories, pulse));
    }

    @ParameterizedTest
    @CsvSource(value = {"20:200:120:Low","25:250:160:Good", "25:200:180:Very good", "90:500:190:Perfect"}, delimiter = ':')
    void shouldReturnEffectivityDescription(double duration, double calories, double pulse, String expected) {
        Assertions.assertEquals(expected, Training.getEffectivityDescription(duration, calories, pulse));
    }
}