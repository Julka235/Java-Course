package org.futurecollars.lesson2.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheWeekTest {

    @Test
    void shouldReturnMonday() {
        // given
        int number = 1;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Monday".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnTuesday() {
        // given
        int number = 2;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Tuesday".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnWednesday() {
        // given
        int number = 3;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Wednesday".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnThursday() {
        // given
        int number = 4;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Thursday".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnFriday() {
        // given
        int number = 5;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Friday".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnWeekend() {
        // given
        int number = 6;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Weekend".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldAlsoReturnWeekend() {
        // given
        int number = 7;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Weekend".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnThereIsNoSuchDay() {
        // given
        int number = 0;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("There is no such day!".toCharArray(), day.toCharArray());
    }
}