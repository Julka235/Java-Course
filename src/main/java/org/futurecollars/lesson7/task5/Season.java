package org.futurecollars.lesson7.task5;

import java.time.Month;

public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    public static Season getSeason(Month month) {
        switch (month)
        {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return AUTUMN;
        }
        return null;
    }
}
