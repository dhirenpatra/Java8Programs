
package com.dhiren.root.string;

import java.util.HashMap;
import java.util.Map;

public class SecondStringFromFirstString {

	Map<Character, Integer> countMap = new HashMap<>();

	private boolean solution(String first, String second) {
		char[] toCharArray = first.toCharArray();
		char[] toCharArray2 = second.toCharArray();

		for (char ch : toCharArray) {
			if (countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			} else {
				countMap.put(ch, 1);
			}
		}

		for (char ch : toCharArray2) {
			if (countMap.containsKey(ch)) {
				int count = countMap.get(ch) - 1;
				countMap.put(ch, count);
				if (count < 0)
					return false;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.err.println(new SecondStringFromFirstString().solution("geekforgeeks", "geeks"));
		System.err.println(new SecondStringFromFirstString().solution("geekforgeeks", "and"));
		System.err.println(new SecondStringFromFirstString().solution("geekforgeeks",
		                                                              "geekforgeeks"));
	}
}
