
package com.dhiren.root.arrays;

public class SumOfElements {

	private static int sumOfAllElements(int length) {
		return (length + 1) * (length + 2) / 2;
	}

	private static void missingNumber(int[] array) {
		int sum = sumOfAllElements(array.length);
		for (int i = 0; i < array.length; i++)
			sum -= array[i];
		System.err.println("Missing Number is : " + sum);
	}

	private static void missingNumberV1(int[] array) {
        Integer num = 0;
        Integer range =  array[1] - array[0];
		for (int i = 0; i < array.length -1; i++) {
            if(array[i+1] - array[i] != range) {
                num = array[i] + range;
            }
		}
        System.err.println("Missing Number is : " +num);
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 7, 8, 9};
		missingNumber(a);

		int[] b = {1, 2, 3, 4, 6};
		missingNumber(b);
        missingNumberV1(b);
	}
}
