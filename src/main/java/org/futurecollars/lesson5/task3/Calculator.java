package org.futurecollars.lesson5.task3;

public class Calculator {
    public static void main(String[] args) {
        Operation[] operations = { new Addition(), new Subtraction(), new Multiplication(), new Division() };
        Calculator calculator = new Calculator(operations);
        System.out.println(calculator.compute(7, 2, '-'));
    }
    private final Operation[] operations;

    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public int compute(int firstValue, int secondValue, char operationSign) {
        for(int i=0; i<operations.length; i++) {
            Operation operation = operations[i];
            if(operation.getSign() == operationSign) {
                return operation.compute(firstValue, secondValue);
            }
        }
        throw new IllegalArgumentException("...");
    }
}
