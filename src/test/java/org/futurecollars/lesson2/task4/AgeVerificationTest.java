package org.futurecollars.lesson2.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerificationTest {

    @Test
    void shouldReturnTrueWhenAdult() {
        // given
        int age = 37;
        // when
        boolean isAdult = AgeVerification.verifyAge(age);
        // then
        Assertions.assertTrue(isAdult);
    }

    @Test
    void shouldReturnTrueWhenRecentlyBecameAnAdult() {
        // given
        int age = 18;
        // when
        boolean isAdult = AgeVerification.verifyAge(age);
        // then
        Assertions.assertTrue(isAdult);
    }

    @Test
    void shouldReturnFalseWhenTeenager() {
        // given
        int age = 15;
        // when
        boolean isAdult = AgeVerification.verifyAge(age);
        // then
        Assertions.assertFalse(isAdult);
    }
}