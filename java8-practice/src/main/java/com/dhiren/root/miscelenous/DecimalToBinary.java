
package com.dhiren.root.miscelenous;

public class DecimalToBinary {

	private static void decToBinary(int n) {
		int[] binaryNum = new int[1000];
		int i = 0;
		while (n > 0) {
			binaryNum[i] = n % 2;
            System.err.println(i + " ==== "+n % 2);
			n = n / 2;
            System.err.println("New number "+n);
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	public static void main(String[] args) {
        decToBinary(9);
        System.err.println(1 % 2);
	}
}
