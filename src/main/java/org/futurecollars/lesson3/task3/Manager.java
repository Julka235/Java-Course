package org.futurecollars.lesson3.task3;

public class Manager extends BaseEmployee {
    int monthlyBonus = 500;

    public Manager(String name, String lastName, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
        this.baseSalary = 5000;
    }

    public void changeBonus(int newBonus) {
        this.monthlyBonus = newBonus;
    }

    public int calculateMonthlySalary() {
        return baseSalary + monthlyBonus;
    }
}
