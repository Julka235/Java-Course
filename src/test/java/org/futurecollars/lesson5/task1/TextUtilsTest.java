package org.futurecollars.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextUtilsTest {

    @Test
    void shouldReturnTrueIfPalindrome() {
        // given
        String text = "Kay ak";
        // when
        boolean isPalindrome = TextUtils.isPalindrome(text);
        // then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    void shouldReturnFalseIfNotPalindrome() {
        // given
        String text = "cat with a hat";
        // when
        boolean isPalindrome = TextUtils.isPalindrome(text);
        // then
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    void shouldReturnTextLength() {
        // given
        String text = "Ebenezer Scrooge";
        // when
        int textLength = TextUtils.getTextLength(text);
        // then
        Assertions.assertEquals(16, textLength);
    }
}