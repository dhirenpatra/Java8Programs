
package com.dhiren.root.optional;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.temporal.WeekFields;
import java.util.*;

public class OptionalMapFlatMapExample {

	public static void main(String[] args) {

		Optional<String> nonEmptyGender = Optional.of("male");
		Optional<String> emptyGender = Optional.empty();
        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));

		System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
		System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

		System.out.println("Optional value   :: " + nonEmptyOptionalGender);
		System.out.println("Optional.map     :: "
		        + nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
		System.out.println("Optional.flatMap :: "
		        + nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

		List<Integer> integerList1 = List.of(1,2,3,4,5,6,7);
		//java.lang.UnsupportedOperationException
		//integerList1.sort(Comparator.naturalOrder());
		List<Integer> integerList2 = List.of(11,21,31,41,51,61,71);
		List<Integer> integerList3 = List.of(111,211,311,411,511,611,711);
		List<Integer> integerList4 = Arrays.asList(1111, 2111, 3111, 4111, 5111, 6111, 7111);

		//java.lang.UnsupportedOperationException
		//integerList1.add(8);

		//java.lang.UnsupportedOperationException
		//integerList4.add(8111);

		integerList4.add(6,8111);

		List<List<Integer>> lists = List.of(integerList1,integerList2,integerList3,integerList4);
		System.out.println(lists);

	}

}
