package org.futurecollars.lesson10.task4;

import java.util.Arrays;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberSelector {
    public static void main(String[] args) {
        String text = "342\n" +
                "5.34\n" +
                "756\n" +
                "1.234e+07\n" +
                "7.234243E-02\n" +
                "6.09\n" +
                "3457\n" +
                "87\n" +
                "1.0001\n" +
                "3\n" +
                "5";
        System.out.println("Integers: " + getIntegers(text));
        System.out.println("Doubles: " + getDoubles(text));
        System.out.println("Scientific numbers: " + getScientificNumbers(text));
    }

    public static Vector<String> getIntegers(String text) {
        String[] numbers = text.split("\n");
        Vector<String> integers = new Vector<>();
        for (String number : numbers) {
            if (!isDouble(number) && !isScientific(number)) {
                integers.add(number);
            }
        }
        return integers;
    }

    public static Vector<String> getDoubles(String text) {
        String[] numbers = text.split("\n");
        Vector<String> doubles = new Vector<>();
        for (String number : numbers) {
            if (isDouble(number) && !isScientific(number)) {
                doubles.add(number);
            }
        }
        return doubles;
    }

    public static Vector<String> getScientificNumbers(String text) {
        String[] numbers = text.split("\n");
        Vector<String> scientificNumbers = new Vector<>();
        for (String number : numbers) {
            if (isScientific(number)) {
                scientificNumbers.add(number);
            }
        }
        return scientificNumbers;
    }

    public static boolean isDouble(String number) {
        Pattern pattern = Pattern.compile("\\b[.]\\b");
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }

    public static boolean isScientific(String number) {
        Pattern pattern = Pattern.compile(".*[a-zA-Z].*");
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
}
