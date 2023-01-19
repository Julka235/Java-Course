package org.futurecollars.lesson6.task8;

public class PersonalIDNumberValidator {
    public static void validate(String personalIDNumber) {
        if(personalIDNumber.length() != 11) {
            throw new IllegalLengthException("The number of digits must be 11.");
        }

        for(int i = 0; i < 11; i++) {
            if(personalIDNumber.charAt(i) < '0' || personalIDNumber.charAt(i) > '9') {
                throw new WrongTypeOfDataException("The variable must be a number.");
            }
        }
    }
}
