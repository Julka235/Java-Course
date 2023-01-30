package org.futurecollars.lesson9.task5;

public class GenericBubbleSort<T extends Comparable<? super T>> {
    public void bubbleSort(T[] array) {
        int arrayLength = array.length;
        while (arrayLength > 0) {
            int lastModifiedIndex = 0;
            for (int i = 1; i < arrayLength; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    T temporary = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temporary;
                    lastModifiedIndex = i;
                }
            }
            arrayLength = lastModifiedIndex;
        }
    }
}
