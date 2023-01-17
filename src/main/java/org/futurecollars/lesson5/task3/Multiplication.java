package org.futurecollars.lesson5.task3;

public class Multiplication implements Operation{
    @Override
    public int getResultOfTheOperation(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }
}
