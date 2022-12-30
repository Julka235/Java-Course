package org.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    @Test
    void shouldReturnTextInUpperCase() {
        // given
        String text = "The Quick Brown Fox jumps over The Lazy Dog.";
        // when
        UpperCase upperCase = new UpperCase();
        String textInUpperCase = upperCase.formatText(text);
        //then
        Assertions.assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.", textInUpperCase);
    }
}