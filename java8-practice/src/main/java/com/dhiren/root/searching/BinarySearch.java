
package com.dhiren.root.searching;

import java.util.Arrays;

public class BinarySearch {

	private static boolean binarySearch(int[] array, int searchElement) {
		System.err.println(Arrays.toString(array));
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midValue = array[mid];
			if (searchElement < midValue)
				high = mid - 1;
			else if (searchElement > midValue)
				low = mid + 1;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] intArray = {21, 32, 43, 56, 87, 97, 34, 52, 9};
		Arrays.sort(intArray);
		System.out.println(binarySearch(intArray, 34));
	}
}
