package org.futurecollars.lesson3.task3;

public abstract class BaseEmployee {

    private final static int DEFAULT_SALARY = 3000;
    private final static int CURRENT_YEAR = 2022;
    private final String name;
    private final String lastName;
    private final int yearOfEmployment;
    private final int baseSalary;

    public BaseEmployee(String name, String lastName, int yearOfEmployment) {
        this(name, lastName, DEFAULT_SALARY, yearOfEmployment);
    }

    public BaseEmployee(String name, String lastName, int baseSalary, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int returnBaseSalary() {
        return baseSalary;
    }

    public int calculateYearsOfEmployment() {
        return CURRENT_YEAR - yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();
}
