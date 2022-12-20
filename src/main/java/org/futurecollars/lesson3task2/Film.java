package org.futurecollars.lesson3task2;

public class Film {
    private final String title;
    private final String director;
    private final int timeInMinutes;
    private final int yearOfRelease;

    public Film(String title, String director, int timeInMinutes, int yearOfRelease) {
        this.title = title;
        this.director = director;
        this.timeInMinutes = timeInMinutes;
        this.yearOfRelease = yearOfRelease;
    }
}