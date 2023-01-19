package org.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this(name, surname, age);
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this(name, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + " " + surname + " is " + age;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getFullSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBonus() {
        return bonus;
    }
}