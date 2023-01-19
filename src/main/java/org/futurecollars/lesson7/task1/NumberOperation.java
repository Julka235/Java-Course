package org.futurecollars.lesson7.task1;

public class NumberOperation {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
