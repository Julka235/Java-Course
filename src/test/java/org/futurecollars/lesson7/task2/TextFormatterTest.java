package org.futurecollars.lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterTest {
    @ParameterizedTest
    @ValueSource(strings = {"cat", "King", "NASA", "isTRUE"})
    @NullAndEmptySource
    void shouldReturnTextInUpperCase(String input) {
        String expectedText;
        if(input == null) expectedText = null;
        else expectedText = input.toUpperCase();
        Assertions.assertEquals(expectedText, TextFormatter.getTextInUpperCase(input));
    }
}