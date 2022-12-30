package org.futurecollars.lesson4.task6;

public class BillCalculator {

    public static double calculate(double billValue, float serviceCharge) {
        return billValue + serviceCharge;
    }

    public static double calculate(double billValue, float serviceCharge, double discount) {
        return billValue * discount + serviceCharge;
    }

    public static double calculate(double billValue, float serviceCharge, short chargeForTakeawayPackages) {
        return billValue + serviceCharge + chargeForTakeawayPackages;
    }
}
