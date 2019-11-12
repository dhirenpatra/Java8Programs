
package com.dhiren.root.string;

import java.util.*;
import java.util.stream.Collectors;

public class PrintCharWithEvenFrequency {

	private static List<Character> getCharacters(String string, Map<Character, Integer> countMap) {
		char[] chars = string.toCharArray();
		for (char ch : chars) {
			if (countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			} else {
				countMap.put(ch, 1);
			}
		}
		//if(countMap instanceof TreeMap)
            System.err.println(countMap);
		return countMap.entrySet()
		        .stream()
		        .filter(entry -> entry.getValue() % 2 == 0)
		        .map(entry -> entry.getKey())
		        .collect(Collectors.toList());
	}

	private static void solutionForOrderOfOccurrence(String string) {
		System.err.println(getCharacters(string, new LinkedHashMap<>()));
        System.err.println("TreeMap : " +getCharacters(string, new TreeMap<>()));
	}

	private static void solutionForNotInOrderOfOccurrence(String string) {
		System.err.println(getCharacters(string, new HashMap<>()));
	}

	public static void main(String[] args) {
		solutionForOrderOfOccurrence("geeksforgeeks");
		solutionForNotInOrderOfOccurrence("geeksforgeeks");
	}

}
