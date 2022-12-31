package org.futurecollars.lesson4.task8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String lastName;
    private final String personalIDNumber;
    private final int yearOfBirth;

    public Person(String name, String lastName, String personalIDNumber, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.personalIDNumber = personalIDNumber;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth
                && Objects.equals(name, person.name)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(personalIDNumber, person.personalIDNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, personalIDNumber, yearOfBirth);
    }
}
