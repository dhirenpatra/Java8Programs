
package com.dhiren.root.string;

public class StringPattern {

	private static boolean checkPattern(String testString, String pattern) {

		int length = pattern.length();
		if (testString.length() < length)
			return false;

		for (int i = 0; i < length - 1; i++) {

			// two adjacent characters in pattern
			char firstCharInPattern = pattern.charAt(i);
			char nextCharInPattern = pattern.charAt(i + 1);

			// last occurrence of first char in string
			int lastPositionOfFirstCharOfPatternInTestString
			    = testString.lastIndexOf(firstCharInPattern);

			// first occurrence of next char in string
			int firstPositionOfNextCharOfPatternInTestString
			    = testString.indexOf(nextCharInPattern);

			if (lastPositionOfFirstCharOfPatternInTestString == -1
			        || firstPositionOfNextCharOfPatternInTestString == -1
			        || firstPositionOfNextCharOfPatternInTestString < lastPositionOfFirstCharOfPatternInTestString)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "engineers rock";
		String pattern = "er";
		System.err.println(checkPattern(str, pattern));
	}

}
