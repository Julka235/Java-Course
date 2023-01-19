package org.futurecollars.lesson7.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Month;

class SeasonTest {
    @ParameterizedTest
    @CsvSource(value = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldReturnWinter(Month month) {
        Assertions.assertEquals(Season.WINTER, Season.getSeason(month));
    }

    @ParameterizedTest
    @CsvSource(value = {"MARCH", "APRIL", "MAY"})
    void shouldReturnSpring(Month month) {
        Assertions.assertEquals(Season.SPRING, Season.getSeason(month));
    }

    @ParameterizedTest
    @CsvSource(value = {"JUNE", "JULY", "AUGUST"})
    void shouldReturnSummer(Month month) {
        Assertions.assertEquals(Season.SUMMER, Season.getSeason(month));
    }

    @ParameterizedTest
    @CsvSource(value = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldReturnAutumn(Month month) {
        Assertions.assertEquals(Season.AUTUMN, Season.getSeason(month));
    }
}