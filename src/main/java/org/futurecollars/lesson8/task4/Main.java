package org.futurecollars.lesson8.task4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Tom", "Johnson", 1984, 173, 74));
        people.add(new Person("Maya", "Wood", 1992, 168, 66));
        people.add(new Person("Anna", "Smith", 2001, 175, 71));
        people.add(new Person("John", "Doe", 1998, 182, 78));
        people.add(new Person("Martha", "Jones", 1990, 164, 68));

        Set<Person> peopleSortedByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        peopleSortedByHeight.addAll(people);

        System.out.println("From the shortest to the tallest:");
        for (Person person : peopleSortedByHeight) {
            System.out.println(person.getFullName());
        }

        Set<Person> peopleSortedByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getWeight(), o1.getWeight());
            }
        });
        peopleSortedByWeight.addAll(people);

        System.out.println("\nFrom the heaviest to the lightest:");
        for (Person person : peopleSortedByWeight) {
            System.out.println(person.getFullName());
        }

        System.out.println("\nFrom the youngest to the oldest:");
        for (Person person : people) {
            System.out.println(person.getFullName());
        }
    }
}

