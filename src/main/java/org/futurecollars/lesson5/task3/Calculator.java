package org.futurecollars.lesson5.task3;

public class Calculator {
    private final Operation[] operations;

    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public int compute(int firstValue, char operationSign, int secondValue) {
        for (Operation operation : operations) {
            if (operation.getSign() == operationSign) {
                return operation.compute(firstValue, secondValue);
            }
        }
        throw new IllegalArgumentException("No operation matches the sign.");
    }
}
