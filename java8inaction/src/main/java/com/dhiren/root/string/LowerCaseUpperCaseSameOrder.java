
package com.dhiren.root.string;

public class LowerCaseUpperCaseSameOrder {

	private static boolean solution(String str) {

		char[] charArray = str.toCharArray();
		String lowerCase = "";
		String upperCase = "";

		for (int i = 0; i < charArray.length; i++)
			System.err.println(charArray[i] + " is upperCase "
			        + (charArray[i] >= 65 && charArray[i] <= 91));

		for (char ch : charArray) {
			if (Character.isLowerCase(ch))
				lowerCase += ch;
			else if (Character.isUpperCase(ch))
				upperCase += ch;
		}
		System.err.println(lowerCase + " " + upperCase);
		return lowerCase.equalsIgnoreCase(upperCase);
	}

	public static void main(String[] args) {
		String str = "geeGkEEsKS";
		System.err.println(solution(str));

	}

}
