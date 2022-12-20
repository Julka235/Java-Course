package org.futurecollars.lesson3.task3;

public class BaseEmployee {
    final static int CURRENT_YEAR = 2022;
    String name;
    String lastName;
    int baseSalary = 3000;
    int yearOfEmployment;

    public BaseEmployee(String name, String lastName, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
    }

    public BaseEmployee() {

    }

    public int returnBaseSalary() {
        return baseSalary;
    }

    public int calculateYearsOfEmployment() {
        return CURRENT_YEAR - yearOfEmployment;
    }
}
