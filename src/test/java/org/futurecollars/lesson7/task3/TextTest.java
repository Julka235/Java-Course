package org.futurecollars.lesson7.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    @ParameterizedTest
    @MethodSource("provideStringsAndTheirLength")
    void shouldReturnTextLength(String input, int expected) {
        Assertions.assertEquals(expected, Text.getTextLength(input));
    }
    private static Stream<Arguments> provideStringsAndTheirLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("Bugs Bunny", 10),
                Arguments.of("Dwight Eisenhower", 17)
        );
    }
}