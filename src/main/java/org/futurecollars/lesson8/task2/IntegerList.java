package org.futurecollars.lesson8.task2;

public class IntegerList implements OwnList {
    private static final int VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE = 10;
    private Integer[] integerList;
    private int listSize;

    public IntegerList() {
        this.listSize = 0;
        this.integerList = new Integer[10];
    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public Integer get(int i) {
        return integerList[i];
    }

    @Override
    public void add(Integer element) {
        if (listSize % VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE == 0) {
            Integer[] newIntegerList = new Integer[listSize + VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE];
            for (int i = 0; i < listSize; i++) {
                newIntegerList[i] = integerList[i];
            }
            integerList = newIntegerList;
        }
        integerList[listSize] = element;
        listSize++;
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException("Such an index does not exist.");
        }

        if (listSize % VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE == 0) {
            Integer[] newIntegerList = new Integer[listSize + VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE];
            for (int i = 0; i < listSize; i++) {
                newIntegerList[i] = integerList[i];
            }
            integerList = newIntegerList;
        }

        for (int i = listSize; i > index; i--) {
            integerList[i] = integerList[i - 1];
        }
        integerList[index] = element;
        listSize++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException("Such an index does not exist.");
        }

        if (integerList.length > listSize * 2) {
            int newListLength = integerList.length / 2 + VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE;
            newListLength = newListLength - (newListLength % VALUE_BY_WHICH_WE_INCREASE_LIST_SIZE);
            Integer[] newIntegerList = new Integer[newListLength];
            for (int i = 0; i < listSize; i++) {
                newIntegerList[i] = integerList[i];
            }
            integerList = newIntegerList;
        }

        for (int i = index; i < listSize - 1; i++) {
            integerList[i] = integerList[i + 1];
        }
        listSize--;
    }
}
