package org.futurecollars.lesson7.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

class CurrencyCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"40:EUR:10", "100:USD:25", "60:GBP:15"}, delimiter = ':')
    void shouldReturnAmountOfBoughtCurrency(double amountOfPLN, Currency currency, double expected) {
        CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
        Mockito.when(currencyValueProvider.getBuyingRate(currency)).thenReturn(4d);

        CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
        double value = calculator.buyCurrency(amountOfPLN, currency);

        Assertions.assertEquals(expected, value);
    }

    @ParameterizedTest
    @CsvSource(value = {"40:EUR:10", "100:USD:25", "60:GBP:15"}, delimiter = ':')
    void shouldReturnAmountOfSoldCurrency(double amountOfPLN, Currency currency, double expected) {
        CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
        Mockito.when(currencyValueProvider.getSellingRate(currency)).thenReturn(4d);

        CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
        double value = calculator.sellCurrency(amountOfPLN, currency);

        Assertions.assertEquals(expected, value);
    }
}