package com.dhiren.datastructure.arrays.impl;

public class DynamicArray<String> {

    private Object[] data;
    private int initialCapacity;
    private int size;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int capacity) {
        this.initialCapacity = capacity;
        data = new Object[initialCapacity];
    }

    public String get(int index) {
        if (index < size)
            return (String) data[index];
        throw new IllegalArgumentException("Provided index is not present");
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    public void insert(int index, String value) {

        // check if index is within the range or not
        // if it is beyond capacity then resize the array
        if (size == initialCapacity)
            resize();

        // insert the element at index and right shift
        // the elements(if any) till it reaches the end.
        // size will be increased by 1
        for (int j = size; j > index; j--) {
            data[j] = data[j - 1];
        }
        data[index] = value;
        size++;
    }

    public void delete(int index) {
        // In delete all positions after the deleted
        // index will be shifted left & size will be decreased by 1
        for(int start = index; start < size -1; start++)
            data[start] = data[start+1];

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public boolean Contains(String value) {
        for (int index = 0; index < size; index++) {
            if (value.equals(get(index)))
                return true;
        }
        return false;
    }

    private void resize() {
        Object[] newArray = new Object[initialCapacity * 2];
        for (int index = 0; index < size; index++) {
            newArray[index] = data[index];
        }
        initialCapacity = initialCapacity * 2;
        data = newArray;
    }

    public void add(String value) {

        if (size == initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

}
