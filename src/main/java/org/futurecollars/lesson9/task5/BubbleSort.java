package org.futurecollars.lesson9.task5;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temporary = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }
}
