package org.futurecollars.lesson6.task9;

public class DivisibilityByThreeValidator {
    public static void validate(int[] values) {
        int n = values.length;
        for(int i = 0; i < n; i++) {
            if(values[i] % 3 != 0)
                try {
                    throw new IllegalArgumentException(values[i] + " is not divisible by 3.");
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            else System.out.println(values[i] + " is divisible by 3");
        }
    }
}
