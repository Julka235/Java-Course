package org.futurecollars.lesson10.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class URLValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"http://www.onet.pl", "https://mail.google.com", "http://wiadmosci.onet.pl", "http://onet.pl"})
    void shouldReturnTrueWhenURLCorrect(String url) {
        boolean isValid = URLValidator.isValid(url);
        Assertions.assertTrue(isValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ht://www.onet.pl", "http/onet.pl", "http://onet.xyz"})
    void shouldReturnFalseWhenURLIncorrect(String url) {
        boolean isValid = URLValidator.isValid(url);
        Assertions.assertFalse(isValid);
    }
}