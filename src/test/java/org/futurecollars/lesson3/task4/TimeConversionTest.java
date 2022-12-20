package org.futurecollars.lesson3.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    @Test
    void shouldConvertMinutesToSeconds() {
        // given
        int minutes = 5;
        // when
        int seconds = TimeConversion.convertMinutesToSeconds(minutes);
        // then
        Assertions.assertEquals(300, seconds);
    }
}