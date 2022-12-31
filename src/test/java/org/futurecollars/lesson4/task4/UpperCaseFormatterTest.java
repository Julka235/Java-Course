package org.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

    @Test
    void shouldReturnTextInUpperCase() {
        // given
        String text = "The Quick Brown Fox jumps over The Lazy Dog.";
        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        // when
        String textInUpperCase = upperCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.", textInUpperCase);
    }
}