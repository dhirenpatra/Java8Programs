package com.dhiren.datastructure.stack.impl;

public interface MyStack<T> {
    void push(Object t);
    Object pop();
    boolean contains(Object t);
    Object access(Object t);
    int size();
}
