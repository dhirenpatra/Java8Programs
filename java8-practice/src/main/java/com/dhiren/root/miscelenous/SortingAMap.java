
package com.dhiren.root.miscelenous;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingAMap {

	private static void sortMap() {

		Map<Character, Integer> countMap = new HashMap<>();
		countMap.put('e', 4);
		countMap.put('f', 3);
		countMap.put('w', 1);
		countMap.put('a', 2);
		countMap.put('s', 8);
		countMap.put('d', 2);
		countMap.put('r', 5);
		countMap.put('y', 1);
		countMap.put('n', 2);
		countMap.put('l', 5);

		LinkedHashMap<Character, Integer> collectAscending = countMap.entrySet()
		        .stream()
		        .sorted(Map.Entry.<Character, Integer>comparingByValue()
		                .reversed())
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                                  (neww, old) -> old, LinkedHashMap::new));

		LinkedHashMap<Character, Integer> collectDescending = countMap.entrySet()
		        .stream()
		        .sorted(Map.Entry.comparingByValue(Integer::compare))
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                                  (neww, old) -> old, LinkedHashMap::new));

		LinkedHashMap<Character, Integer> collectDescendingV2 = countMap.entrySet()
		        .stream()
		        .sorted(Map.Entry.comparingByValue())
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                                  (neww, old) -> old, LinkedHashMap::new));

		System.err.println(collectAscending);
		System.err.println(collectDescending);
		System.err.println(collectDescendingV2);
	}

	public static void main(String[] args) {
		sortMap();
	}

}
