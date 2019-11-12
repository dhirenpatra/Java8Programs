
package com.dhiren.root.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	private static String value = "dhiren_kumar_patra";

	public String reverseStringMethodOne(String inputString) {
		byte[] inputStringBytes = inputString.getBytes();
		byte[] targetStringBytes = new byte[inputStringBytes.length];
		for (int index = 0; index < inputStringBytes.length; index++) {
			targetStringBytes[index] = inputStringBytes[inputStringBytes.length - index - 1];
		}
		return new String(targetStringBytes);
	}

	public String reverseStringMethodTwo(String inputString) {
		char[] charArray = inputString.toCharArray();
		for (int index = charArray.length - 1; index > 0; index--) {
			charArray[charArray.length - 1 - index] = charArray[index];
		}
		return new String(charArray);
	}

	public String reverseStringMethodThree(String inputString) {
		StringBuilder builder = new StringBuilder(inputString);
		builder.reverse();
		return builder.toString();
	}

	public List<Character> reverseStringMethodFour(String inputString) {
		List<Character> charList = new ArrayList<>();
		char[] charArray = inputString.toCharArray();
		for (char character : charArray) {
			charList.add(character);
		}
		Collections.reverse(charList);
		return charList;
	}

	public String reverseStringMethodFive(String inputString) {
		char[] charArray = inputString.toCharArray();
		for(int start = 0 ; start < inputString.length() / 2 ; start++) {
			swap(charArray,start,inputString.length() - start - 1);
		}
		return new String(charArray);
	}

	public String reverseStringMethodSix(String inputString) {

		char[] charArray = inputString.toCharArray();
		int start = 0;
		int end = inputString.length() -1;
		while (start < end) {
			swap(charArray,start,end);
			start++;
			end--;
		}
		return new String(charArray);
	}

	private void swap(char[] charArray, int start, int end) {
		char temp = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = temp;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.err.println(" Method 1 using byte[]                ::  "
		        + reverseString.reverseStringMethodOne(value));
		System.err.println(" Method 2 using toCharArray reverse   ::  "
		        + reverseString.reverseStringMethodTwo(value));
		System.err.println(" Method 3 using StringBuilder reverse ::  "
		        + reverseString.reverseStringMethodThree(value));
		System.err.println(" Method 4 using Collections   reverse ::  "
		        + reverseString.reverseStringMethodFour(value));

		System.err.println(" Method 5 using Collections   reverse ::  "
				+ reverseString.reverseStringMethodFive(value));
		System.err.println(" Method 6 using Collections   reverse ::  "
				+ reverseString.reverseStringMethodSix(value));
	}

}
