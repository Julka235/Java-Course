package org.futurecollars.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalIDNumberValidator {
    public static boolean isValid(String personalIDNumber) {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(personalIDNumber);
        return matcher.matches();
    }
}
