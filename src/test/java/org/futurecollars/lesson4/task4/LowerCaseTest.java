package org.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTest {

    @Test
    void shouldReturnTextInLowerCase() {
        // given
        String text = "The Quick Brown Fox jumps over The Lazy Dog";
        // when
        LowerCase lowerCase = new LowerCase();
        String textInLowerCase = lowerCase.formatText(text);
        //then
        Assertions.assertEquals("the quick brown fox jumps over the lazy dog", textInLowerCase);
    }
}