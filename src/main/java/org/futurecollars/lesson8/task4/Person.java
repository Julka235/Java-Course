package org.futurecollars.lesson8.task4;

public class Person implements Comparable<Person>{
    private final String name;
    private final String lastName;
    private final int yearOfBirth;
    private final int height;
    private final int weight;

    public Person(String name, String lastName, int yearOfBirth, int height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getFullName() {
        return name + ' ' + lastName;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.yearOfBirth, this.yearOfBirth);
    }
}
