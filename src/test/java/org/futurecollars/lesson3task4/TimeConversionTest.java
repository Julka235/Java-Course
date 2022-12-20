package org.futurecollars.lesson3task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    @Test
    void shouldReturn60() {
        // given
        int minutes = 1;
        // when
        int seconds = TimeConversion.convertMinutesToSeconds(minutes);
        // then
        Assertions.assertEquals(60, seconds);
    }

    @Test
    void shouldReturn300() {
        // given
        int minutes = 5;
        // when
        int seconds = TimeConversion.convertMinutesToSeconds(minutes);
        // then
        Assertions.assertEquals(300, seconds);
    }
}