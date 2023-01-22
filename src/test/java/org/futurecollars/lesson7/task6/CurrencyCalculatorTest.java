package org.futurecollars.lesson7.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

class CurrencyCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"47:EUR:10", "129:USD:30", "54:GBP:10"}, delimiter = ':')
    void shouldReturnAmountOfBoughtCurrency(double amountOfPLN, Currency currency, double expected) {
        CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
        Mockito.when(currencyValueProvider.getBuyingRate(Currency.EUR)).thenReturn(4.7d);
        Mockito.when(currencyValueProvider.getBuyingRate(Currency.USD)).thenReturn(4.3d);
        Mockito.when(currencyValueProvider.getBuyingRate(Currency.GBP)).thenReturn(5.4d);

        CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
        double value = calculator.buyCurrency(amountOfPLN, currency);

        Assertions.assertEquals(expected, value);
    }

    @ParameterizedTest
    @CsvSource(value = {"47:EUR:10", "129:USD:30", "54:GBP:10"}, delimiter = ':')
    void shouldReturnAmountOfSoldCurrency(double amountOfPLN, Currency currency, double expected) {
        CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
        Mockito.when(currencyValueProvider.getSellingRate(Currency.EUR)).thenReturn(4.7d);
        Mockito.when(currencyValueProvider.getSellingRate(Currency.USD)).thenReturn(4.3d);
        Mockito.when(currencyValueProvider.getSellingRate(Currency.GBP)).thenReturn(5.4d);

        CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
        double value = calculator.sellCurrency(amountOfPLN, currency);

        Assertions.assertEquals(expected, value);
    }
}