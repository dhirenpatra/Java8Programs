
package com.dhiren.root.string;

public class TwoStringSameCharSameOrder {

	private String getString(char ch) {
		return String.valueOf(ch);
	}

	private boolean solution(String first, String second) {
		String a = getString(first.charAt(0)), b = getString(second.charAt(0));

		for (int i = 1; i < first.length(); i++) {
			if (first.charAt(i) != first.charAt(i - 1)) {
				a += getString(first.charAt(i));
			}
		}

		for (int i = 1; i < second.length(); i++) {
			if (second.charAt(i) != second.charAt(i - 1)) {
				b += getString(second.charAt(i));
			}
		}

		return a.equals(b);
	}

	public static void main(String[] args) {
		TwoStringSameCharSameOrder main = new TwoStringSameCharSameOrder();
        System.err.println(main.solution("Geeks", "Geks"));
	}

}
