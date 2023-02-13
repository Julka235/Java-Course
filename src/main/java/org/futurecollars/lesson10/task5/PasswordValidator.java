package org.futurecollars.lesson10.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean isValid(String password) {
        return doesContainUppercaseLetter(password)
                && doesContainOneDigit(password)
                && isLengthValid(password)
                && doesNotContainCurrentYear(password);
    }

    private static boolean doesContainUppercaseLetter(String password) {
        Pattern pattern = Pattern.compile(".*[A-Z].*");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean doesContainOneDigit(String password) {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean isLengthValid(String password) {
        Pattern pattern = Pattern.compile(".{7,}");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean doesNotContainCurrentYear(String password) {
        Pattern pattern = Pattern.compile(".*21.*");
        Matcher matcher = pattern.matcher(password);
        return !matcher.find();
    }
}
