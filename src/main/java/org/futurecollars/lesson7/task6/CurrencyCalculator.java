package org.futurecollars.lesson7.task6;

public class CurrencyCalculator {
    private CurrencyValueProvider currencyValueProvider;

    public double buyCurrency(double amountOfPLN, Currency currency) {
        return amountOfPLN / currencyValueProvider.getBuyingRate(currency);
    }

    public double sellCurrency(double amountOfPLN, Currency currency) {
        return amountOfPLN / currencyValueProvider.getSellingRate(currency);
    }

    CurrencyCalculator(CurrencyValueProvider currencyValueProvider) {
        this.currencyValueProvider = currencyValueProvider;
    }
}
