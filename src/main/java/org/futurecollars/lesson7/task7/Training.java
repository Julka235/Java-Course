package org.futurecollars.lesson7.task7;

public class Training {
    public static String getEffectivityDescription(double duration, double calories, double pulse) {
        double effectivity = getEffectivity(duration, calories, pulse);
        if(effectivity < 1.2) return "Low";
        else if(effectivity < 2.0) return "Good";
        else if(effectivity < 3.0) return "Very good";
        else return "Perfect";
    }

    private static double getEffectivity(double duration, double calories, double pulse) {
        double durationEffectivity = getDurationEffectivity(duration);
        double burnedCaloriesEffectivity = getCaloriesEffectivity(calories);
        double averagePulseEffectivity = getPulseEffectivity(pulse);
        return (durationEffectivity + burnedCaloriesEffectivity * 2 + averagePulseEffectivity * 3) / 6;
    }

    private static int getDurationEffectivity(double duration) {
        if(duration < 30) return 1;
        else if(duration <= 60) return 2;
        else return 3;
    }

    private static int getCaloriesEffectivity(double calories) {
        if(calories <= 300) return 1;
        else if(calories < 400) return 2;
        else return 3;
    }

    private static int getPulseEffectivity(double pulse) {
        if(pulse < 160) return 1;
        else if(pulse <= 175) return 2;
        else return 3;
    }
}
