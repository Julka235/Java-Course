package org.futurecollars.lesson7.task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

class SalaryCalculatorTest {
    @ParameterizedTest
    @CsvSource(value = {"500:2:2900", "400:4:3200"}, delimiter = ':')
    void shouldReturnSalary(int oneTimeBonus, int numberOfSaturdays, int expected) {
        BasicSalaryProvider basicSalaryProvider = Mockito.mock(BasicSalaryProvider.class);
        Mockito.when(basicSalaryProvider.getBasicSalary()).thenReturn(2000);
        WorkedSaturdayPayProvider workedSaturdayPayProvider = Mockito.mock(WorkedSaturdayPayProvider.class);
        Mockito.when(workedSaturdayPayProvider.getWorkedSaturdayPay()).thenReturn(200);

        SalaryCalculator salaryCalculator = new SalaryCalculator(basicSalaryProvider,workedSaturdayPayProvider);
        int salary = salaryCalculator.getSalary(oneTimeBonus, numberOfSaturdays);

        Assertions.assertEquals(expected, salary);
    }
}