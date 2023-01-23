package org.futurecollars.lesson8.task2;

public class IntegerList implements OwnList{
    Integer[] integerList;
    int n;

    public IntegerList() {
        this.n = 0;
        this.integerList = new Integer[n];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void add(Integer element) {
        Integer[] newIntegerList = new Integer[n + 1];
        for(int i = 0; i < n; i++) {
            newIntegerList[i] = integerList[i];
        }
        newIntegerList[n] = element;
        integerList = newIntegerList;
        n++;
    }

    @Override
    public Integer get(int i) {
        return integerList[i];
    }

    @Override
    public void add(int index, Integer element) {
        if(index < 0 || index >= n) {
            throw new ArrayIndexOutOfBoundsException("Such an index does not exist.");
        }

        Integer[] newIntegerList = new Integer[n + 1];
        for(int i = 0; i < index; i++) {
            newIntegerList[i] = integerList[i];
        }
        newIntegerList[index] = element;
        for(int i = index + 1; i < n + 1; i++) {
            newIntegerList[i] = integerList[i-1];
        }

        integerList = newIntegerList;
        n++;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= n) {
            throw new ArrayIndexOutOfBoundsException("Such an index does not exist.");
        }

        Integer[] newIntegerList = new Integer[n - 1];
        for(int i = 0; i < index; i++) {
            newIntegerList[i] = integerList[i];
        }
        for(int i = index; i < n - 1; i++) {
            newIntegerList[i] = integerList[i + 1];
        }

        integerList = newIntegerList;
        n--;
    }
}
