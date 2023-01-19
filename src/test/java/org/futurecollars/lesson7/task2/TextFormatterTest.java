package org.futurecollars.lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class TextFormatterTest {
    @ParameterizedTest
    @ValueSource(strings = {"cat", "King", "NASA", "isTRUE"})
    @EmptySource
    void shouldReturnTextInUpperCaseOrEmptyForEmpty(String input) {
        String expectedText = input.toUpperCase();
        Assertions.assertEquals(expectedText, TextFormatter.getTextInUpperCase(input));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnNullForNull(String input) {
        Assertions.assertNull(TextFormatter.getTextInUpperCase(input));
    }
}