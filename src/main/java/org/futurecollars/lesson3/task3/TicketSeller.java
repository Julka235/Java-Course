package org.futurecollars.lesson3.task3;

public class TicketSeller extends BaseEmployee{

    public TicketSeller(String name, String lastName, int yearOfEmployment) {
        super(name, lastName, yearOfEmployment);
    }

    public TicketSeller(String name, String lastName, int baseSalary, int yearOfEmployment) {
        super(name, lastName, baseSalary, yearOfEmployment);
    }

    public int calculateMonthlySalary() {
        return returnBaseSalary();
    }
}
