package com.dhiren.datastructure.bst;

public interface Tree<T> {

    void insert(T data);
    T minValue();
    T maxValue();
    void traverse();
    T delete(Node node);

}
