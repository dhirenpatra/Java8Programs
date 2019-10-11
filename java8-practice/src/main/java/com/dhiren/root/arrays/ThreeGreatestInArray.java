
package com.dhiren.root.arrays;

public class ThreeGreatestInArray {

	static int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

	private static void findThreeLargest(int[] array) {
		if (array.length < 3) {
			System.err.println("length must be more than 3 , provided was " + array.length);
		} else {
			for (int index = 0; index < array.length; index++) {
				if (array[index] > first) {
					third = second;
					second = first;
					first = array[index];
				} else if (array[index] > second) {
					third = second;
					second = array[index];
				} else if (array[index] > third)
					third = array[index];
			}
			System.err.println(first + ", " + second + ", " + third);
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2};
		findThreeLargest(array);
	}
}
