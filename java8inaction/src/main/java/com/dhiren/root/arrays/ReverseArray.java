
package com.dhiren.root.arrays;

import java.util.Arrays;

public class ReverseArray {

	private static void reverseArray(int[] array) {
		int begin = 0;
		int end = array.length - 1;
		while (begin < end) {
            swapWithoutTemp(array, begin, end);
			begin++;
			end--;
		}
		System.err.println(Arrays.toString(array));
	}

	private static void reverseArray1(int[] array) {
		for (int begin = 0; begin < array.length - begin; begin++) {
            swapWithTemp(array, begin, array.length - 1 - begin);
		}
		System.err.println(Arrays.toString(array));
	}

	private static void swapWithTemp(int[] array, int i, int i1) {
		int temp = array[i];
		array[i] = array[i1];
		array[i1] = temp;
	}

    private static void swapWithoutTemp(int[] array, int i, int i1) {
        array[i] = array[i] + array[i1];
        array[i1] = array[i] - array[i1];
        array[i] = array[i] - array[i1];
    }

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		System.err.println("Array before reversing");
		System.err.println(Arrays.toString(array));
		System.err.println("Array after reversing");
		reverseArray(array);
        int[] array1 = {1, 2, 3, 4, 5, 6};
        reverseArray1(array1);
	}
}
