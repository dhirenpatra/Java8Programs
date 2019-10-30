package com.dhiren.datastructure.stack.using.array;

import java.util.Arrays;

public class Stack<T> {

    private T[] data;
    private int totalItems;
    private int INITIAL_SIZE;

    public Stack() {
        this(2);
    }

    public Stack(int INITIAL_SIZE) {
        this.INITIAL_SIZE = INITIAL_SIZE;
        data = (T[]) new Object[INITIAL_SIZE];
    }

    public boolean isEmpty() {
        return totalItems == 0;
    }

    public int capacity() {
        return INITIAL_SIZE;
    }

    public int size() {
        return totalItems;
    }

    public void push(T data) {
        if(totalItems == capacity())
            resize(capacity() * 2);
        this.data[totalItems++] = data;
    }

    private void resize(int capacity) {
        T[] tempArray = (T[]) new Object[capacity];
        for(int i = 0; i < totalItems; i++) {
            tempArray[i] = data[i];
        }
        INITIAL_SIZE = capacity;
        data = tempArray;
    }

    public void pop() {
        T item = this.data[--totalItems];
        if(totalItems > 0 && totalItems == capacity() / 4) {
            resize(capacity() / 2);
        }
        this.data[totalItems] = null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + Arrays.toString(data) +
                ", totalItems=" + totalItems +
                ", INITIAL_SIZE=" + INITIAL_SIZE +
                '}';
    }
}
