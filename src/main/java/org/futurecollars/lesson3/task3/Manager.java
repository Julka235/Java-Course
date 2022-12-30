package org.futurecollars.lesson3.task3;

public class Manager extends BaseEmployee {

    private final static int DEFAULT_SALARY = 5000;
    private final static int DEFAULT_BONUS = 500;
    private int monthlyBonus;

    public Manager(String name, String lastName, int yearOfEmployment) {
        super(name, lastName, DEFAULT_SALARY, yearOfEmployment);
        this.monthlyBonus = DEFAULT_BONUS;
    }

    public Manager(String name, String lastName, int baseSalary, int yearOfEmployment) {
        super(name, lastName, baseSalary, yearOfEmployment);
        this.monthlyBonus = DEFAULT_BONUS;
    }

    public void changeBonus(int newBonus) {
        monthlyBonus = newBonus;
    }

    public int calculateMonthlySalary() {
        return returnBaseSalary() + monthlyBonus;
    }
}
