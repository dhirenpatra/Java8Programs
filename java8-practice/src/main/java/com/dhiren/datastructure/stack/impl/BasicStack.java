
package com.dhiren.datastructure.stack.impl;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BasicStack<T> implements MyStack{

	private T[] data;
	private int stackPointer;

	public BasicStack() {
		this.data = (T[]) new Object[1000];
		this.stackPointer = 0;
	}

	public int size() {
		return stackPointer;
	}

	@Override
	public void push(Object item) {
		data[stackPointer++] = (T) item;
	}

	public T pop() {
		if (stackPointer == 0) {
			throw new IllegalStateException("Stack size is empty can't pop elements...");
		}
		return data[--stackPointer];
	}

	public boolean contains(Object item) {
        return Arrays.asList(data).stream()
                .filter(element -> item.equals(element))
                .findAny()
                .isPresent();
    }

    public T access(Object item) {
        return Arrays.asList(data).stream()
                .filter(element -> item.equals(element))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("No Element"));
    }
}
