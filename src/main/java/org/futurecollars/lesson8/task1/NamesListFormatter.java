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
        List<String> sortedNames = new ArrayList<>();
        for (String name : names) {
            sortedNames.add(name);
        }
        Collections.sort(sortedNames);

        List<String> uniqueNames = new ArrayList<>();

        uniqueNames.add(sortedNames.get(0));
        for(int i = 1; i < sortedNames.size(); i++) {
            if(!sortedNames.get(i).equals(sortedNames.get(i - 1))) {
                uniqueNames.add(sortedNames.get(i));
            }
        }
        System.out.println("Lista bez duplikatów: " + uniqueNames);
    }

    public static void displayInReverseOrder(List<String> names) {
        List<String> namesInReverseOrder = new ArrayList<>();
        for(int i = names.size() - 1; i >= 0; i--) {
            namesInReverseOrder.add(names.get(i));
        }

        for(int i = 0; i < namesInReverseOrder.size(); i++) {
            names.set(i, namesInReverseOrder.get(i));
        }

        System.out.println("Elementy w odwrotnej kolejności: " + names);
    }

    public static void changeElement(List<String> names, String nameToBeChanged, String newName) {
        for(int i = 0; i < names.size(); i++) {
            if(Objects.equals(names.get(i), nameToBeChanged)) {
                names.set(i, newName);
            }
        }

        System.out.println("Elementy po zmianie : " + nameToBeChanged + " -> " + newName);
        System.out.println(names);
    }
}
