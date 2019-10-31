package com.dhiren.datastructure.linkedlist.impl;

public interface List<T extends Comparable> {

    void insert(T data);
    void remove(T data);
    int size();
    void clear();
    void reverse();

}
