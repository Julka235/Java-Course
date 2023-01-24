package org.futurecollars.lesson5.task3;

public class Addition implements Operation {
    @Override
    public int compute(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public char getSign() {
        return '+';
    }
}
