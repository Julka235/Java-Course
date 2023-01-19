package org.futurecollars.lesson6.task7;

import static java.lang.Math.sqrt;

public class ExtractionOfARoot {
    public static double extractTheRootOf(double number) {
        if(number < 0) throw new IllegalArgumentException("Number cannot be negative.");
        return sqrt(number);
    }
}
