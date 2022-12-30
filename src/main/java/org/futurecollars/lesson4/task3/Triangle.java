package org.futurecollars.lesson4.task3;

public class Triangle implements Shape{

    private final double base;
    private final double height;
    private final double sideA;
    private final double sideC;

    public Triangle(double base, double height, double sideA, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + base + sideC;
    }
}
