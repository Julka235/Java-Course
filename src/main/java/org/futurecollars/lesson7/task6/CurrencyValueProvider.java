package org.futurecollars.lesson7.task6;

public interface CurrencyValueProvider {
    double getBuyingRate(Currency currency);
    double getSellingRate(Currency currency);
}
