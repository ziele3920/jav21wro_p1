package com.sda.list;

public interface IList<T> {

    boolean isEmpty();
    int size();
    void add(T value);
    void add(int index, T value);
    T get(int index);
    void remove(int index);


}
