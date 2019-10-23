
package com.dhiren.datastructure.stack.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ListStack<T> implements MyStack {

	private List<T> data;

	public ListStack() {
		this.data = new ArrayList<>();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public void push(Object item) {
		data.add((T) item);
	}

	@Override
	public T pop() {
		if (data.size() == 0) {
			throw new IllegalStateException("Stack size is empty can't pop elements...");
		}
		return data.remove(data.size() -1);
	}

	@Override
	public boolean contains(Object item) {
        return data.stream()
                .filter(element -> item.equals(element))
                .findAny()
                .isPresent();
    }

	@Override
	public T access(Object item) {
        return data.stream()
                .filter(element -> item.equals(element))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("No Element"));
    }
}
