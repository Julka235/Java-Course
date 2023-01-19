package org.futurecollars.lesson5.task3;

public class Multiplication implements Operation{
    @Override
    public int compute(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }
}
