package org.futurecollars.lesson10.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void shouldReturnFalseWhenPasswordDoesNotContainUppercaseLetter() {
        // given
        String password = "password12";
        // when
        boolean isValid = PasswordValidator.isValid(password);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalseWhenPasswordDoesNotContainDigit() {
        // given
        String password = "Password";
        // when
        boolean isValid = PasswordValidator.isValid(password);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalseWhenPasswordTooShort() {
        // given
        String password = "Cat7";
        // when
        boolean isValid = PasswordValidator.isValid(password);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalseWhenPasswordContainsCurrentYear() {
        // given
        String password = "Password21";
        // when
        boolean isValid = PasswordValidator.isValid(password);
        // then
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnTrueWhenValidPassword() {
        // given
        String password = "VeryValidPassword100";
        // when
        boolean isValid = PasswordValidator.isValid(password);
        // then
        Assertions.assertTrue(isValid);
    }
}