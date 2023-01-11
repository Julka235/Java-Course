package org.futurecollars.lesson7.notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

class SampleTest {
    @ParameterizedTest
    @ValueSource(strings = {"radar", "anna", "wow"})
    void shouldVerifyIsStringPalindrome(String input) {
        Assertions.assertTrue(Sample.isPalindrome(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldVerifyIsStringPalindrome2(String input) {
        Assertions.assertFalse(Sample.isPalindrome(input));
    }

    @Disabled
    @ParameterizedTest
    @EnumSource(value = TreatmentType.class, names = {"SURGICAL", "PALLIATIVE"})
    void shouldVerifyIsHospitalNeeded(TreatmentType treatmentType) {
        Assertions.assertTrue(Sample.isHospitalizationNeeded(treatmentType));
    }

    @ParameterizedTest(name = "My test")
    @CsvSource(value = {"TEST :test", " Test:test", "TEST:test"}, delimiter = ':')
    void shouldVerifyStringTrimAndLowerCase(String input, String expected) {
        String actualValue = input.trim().toLowerCase();
        Assertions.assertEquals(expected, actualValue);
    }


    @ParameterizedTest
    @MethodSource("provideStringsForTrimAndInLowerCase")
    @DisplayName("Should verify string trim and lower case with arguments provided by method")
    void shouldVerifyStringTrimAndLowerCase2(String input, String expected) {
        String actualValue = input.trim().toLowerCase();
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideStringsForTrimAndInLowerCase() {
        return Stream.of(
                Arguments.of("TEST ", "test"),
                Arguments.of(" Test", "test"),
                Arguments.of("TEST", "test")
        );
    }

}