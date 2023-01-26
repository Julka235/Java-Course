package org.futurecollars.lesson8.task1;

import java.util.*;

public class NamesListFormatter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        displayUniqueNames(names);
        displayInReverseOrder(names);
        changeElement(names, "Anna", "Joanna");
    }

    public static void displayUniqueNames(List<String> names) {
        Set<String> uniqueNames = new LinkedHashSet<>(names);

        System.out.print("Lista bez duplikatów: ");
        Iterator<String> iterator = uniqueNames.iterator();
        for (int i=0; i< uniqueNames.size() - 1; i++) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println(iterator.next());
    }

    public static void displayInReverseOrder(List<String> names) {
        System.out.println("Elementy w odwrotnej kolejności: ");
        for (int i = names.size() - 1; i > 0; i--) {
            System.out.print(names.get(i) + ", ");
        }
        System.out.println(names.get(0));
    }

    public static void changeElement(List<String> names, String nameToBeChanged, String newName) {
        for (int i = 0; i < names.size(); i++) {
            if (Objects.equals(names.get(i), nameToBeChanged)) {
                names.set(i, newName);
            }
        }

        System.out.println("Elementy po zmianie: " + nameToBeChanged + " -> " + newName);
        for (int i = 0; i < names.size() - 1; i++) {
            System.out.print(names.get(i) + ", ");
        }
        System.out.println(names.get(names.size() - 1));
    }
}
