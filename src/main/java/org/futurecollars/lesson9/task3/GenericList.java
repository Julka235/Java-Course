package org.futurecollars.lesson9.task3;

public class GenericList<E> implements OwnList {
    private E[] genericList = (E[]) new Object[DEFAULT_CAPACITY];
    private int listSize = 0;

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public Object get(int index) {
        return genericList[index];
    }

    @Override
    public boolean add(Object o) {
        if (listSize + 1 > genericList.length) {
            E[] newGenericList = (E[]) new Object[listSize + 10];
            for (int i = 0; i < listSize; i++) {
                newGenericList[i] = genericList[i];
            }
            genericList = newGenericList;
        }

        genericList[listSize] = (E) o;
        listSize++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = 0;
        for (; index < listSize; index++) {
            if (genericList[index] == (E) o) break;
        }

        if (index == listSize) return false;

        for (; index < listSize - 1; index++) {
            genericList[index] = genericList[index + 1];
        }
        listSize--;
        return true;
    }
}
