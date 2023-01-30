package org.futurecollars.lesson7.task8;

public class SalaryCalculator {
    private final BasicSalaryProvider basicSalaryProvider;
    private final WorkedSaturdayPayProvider workedSaturdayPayProvider;

    public SalaryCalculator(BasicSalaryProvider basicSalaryProvider, WorkedSaturdayPayProvider workedSaturdayPayProvider) {
        this.basicSalaryProvider = basicSalaryProvider;
        this.workedSaturdayPayProvider = workedSaturdayPayProvider;
    }

    public int getSalary(int oneTimeBonus, int numberOfSaturdays) {
        return basicSalaryProvider.getBasicSalary() + oneTimeBonus + workedSaturdayPayProvider.getWorkedSaturdayPay() * numberOfSaturdays;
    }
}
