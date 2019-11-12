
package com.dhiren.root.string;

import java.util.Arrays;

public class ReverseWordsInString {

	private static String value = "Dhiren is a very good boy";

	private String reverseSentence(String inputString) {
		String[] split = inputString.split(" ");
		System.err.println(Arrays.toString(split));
		String result = "";
		for(int index = 0 ; index < split.length ; index++) {
			if(index == split.length - 1) {
				result = split[index] + result;
			} else {
				result = " " + split[index] + result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ReverseWordsInString reverseString = new ReverseWordsInString();
		System.err.println(" Reverse a sentence n" +reverseString.reverseSentence(value));
	}

}
