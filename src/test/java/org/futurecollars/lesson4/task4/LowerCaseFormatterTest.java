package org.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseFormatterTest {

    @Test
    void shouldReturnTextInLowerCase() {
        // given
        String text = "The Quick Brown Fox jumps over The Lazy Dog";
        LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
        // when
        String textInLowerCase = lowerCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("the quick brown fox jumps over the lazy dog", textInLowerCase);
    }
}