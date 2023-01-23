package org.futurecollars.lesson8.task2;

import java.util.List;

public interface OwnList {
    int size();
    boolean isEmpty();
    void add(Integer element);
    Integer get(int i);
    void add(int index, Integer element);
    void remove(int index);
}
