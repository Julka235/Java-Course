package org.futurecollars.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void shouldReturnTrueIfPalindrome() {
        // given
        String text = "Kay ak";
        // when
        boolean palindrome = Text.isPalindrome(text);
        // then
        Assertions.assertTrue(palindrome);
    }

    @Test
    void shouldReturnFalseIfNotPalindrome() {
        // given
        String text = "cat with a hat";
        // when
        boolean palindrome = Text.isPalindrome(text);
        // then
        Assertions.assertFalse(palindrome);
    }

    @Test
    void shouldReturnTextLength() {
        // given
        String text = "Ebenezer Scrooge";
        // when
        int textLength = Text.getTextLength(text);
        // then
        Assertions.assertEquals(16, textLength);
    }
}