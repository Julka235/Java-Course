package org.futurecollars.lesson10.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalIDNumberValidatorTest {

    @Test
    void shouldReturnFalseWhenPersonalIDNumberIsTooLong() {
        // given
        String personalIDNumber = "7723684263762839";
        // when
        boolean isValid = PersonalIDNumberValidator.isValid(personalIDNumber);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalseWhenPersonalIDNumberIsTooShort() {
        // given
        String personalIDNumber = "772367328";
        // when
        boolean isValid = PersonalIDNumberValidator.isValid(personalIDNumber);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalseWhenPersonalIDNumberContainsOtherCharactersThanDigits() {
        // given
        String personalIDNumber = "8923h;8934";
        // when
        boolean isValid = PersonalIDNumberValidator.isValid(personalIDNumber);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnTrueWhenPersonalIDNumberIsElevenDigitsLong() {
        // given
        String personalIDNumber = "11111111111";
        // when
        boolean isValid = PersonalIDNumberValidator.isValid(personalIDNumber);
        // then
        Assertions.assertTrue(isValid);
    }
}