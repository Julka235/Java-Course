package org.futurecollars.lesson7.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Month;

class SeasonTest {
    @ParameterizedTest
    @CsvSource(value = {"APRIL:SPRING", "DECEMBER:WINTER", "SEPTEMBER:AUTUMN", "JULY:SUMMER"}, delimiter = ':')
    void shouldReturnSeasonForMonth(Month month, Season season) {
        Assertions.assertEquals(season, Season.getSeason(month));
    }
}