package org.futurecollars.lesson3.task3;

public class TicketSeller extends BaseEmployee{

    public TicketSeller(String name, String lastName, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateMonthlySalary() {
        return baseSalary;
    }
}
