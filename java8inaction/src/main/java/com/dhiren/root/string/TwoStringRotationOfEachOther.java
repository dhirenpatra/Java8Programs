
package com.dhiren.root.string;

public class TwoStringRotationOfEachOther {

	private static boolean checkRotationOfEachOther(String s1, String s2) {

		if (s1.length() == s2.length() && s1.contentEquals(s2))
			return true;
		return false;
	}

	public static void main(String[] args) {
        System.err.println(checkRotationOfEachOther("AFGDSHJLK", "LJKGHFDSA"));
	}

}
