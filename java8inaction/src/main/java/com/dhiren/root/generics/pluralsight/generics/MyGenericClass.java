
package com.dhiren.root.generics.pluralsight.generics;

public class MyGenericClass<T> {

	private T[] array;

	public MyGenericClass(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public <E> void printElements(E[] array) {
		for (E e : array) {
            System.out.println(e);
		}
	}

    public <T> void printElementOneByOne(T[] array) {
        for (T e : array) {
            System.out.println(e);
        }
    }
}
