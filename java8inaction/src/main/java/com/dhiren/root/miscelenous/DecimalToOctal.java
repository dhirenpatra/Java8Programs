
package com.dhiren.root.miscelenous;

public class DecimalToOctal {

	private static void decToOctal(int n) {
		int[] octalNum = new int[32];
		int i = 0;
		while (n > 0) {
			octalNum[i] = n % 8;
			n = n / 8;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(octalNum[j]);
	}

	public static void main(String[] args) {
		decToOctal(9);
	}
}
