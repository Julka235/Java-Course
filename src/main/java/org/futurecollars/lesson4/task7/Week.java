package org.futurecollars.lesson4.task7;

public class Week {
    public enum DayOfTheWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static String returnDayOfTheWeek (DayOfTheWeek dayOfTheWeek) {
        return String.valueOf(dayOfTheWeek);
    }
}
