
package com.dhiren.root.list;

import com.dhiren.root.lambda.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListSamples {
	public static void main(String[] args) {
		 List<String> stringList = Collections.emptyList();
		 //stringList.add("Dhiren");
		 System.err.println(stringList);

		 List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9);
		 List<Integer> integerList = integers.stream().sorted().collect(Collectors.toList());
		 System.out.println(integerList);

		 List<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 System.out.println(list);
		 list.remove(2);
		 System.out.println(list);

		 List<String> names = new ArrayList<>();
		 names.add("Dhiren");
		 names.add("Disha");
		 names.add("Dinesh");
		 names.add("Darren");
		 System.out.println(names);

		 names.remove("Dinesh");
		 System.out.println(names);
		 names.remove(2);
		 System.out.println(names);



		List<Person> personList = Arrays.asList(new Person("a", "b", 12),
                                                new Person("c", "d", 12),
		                                        new Person("e", "f", 12));


		final Integer age = personList.stream()
		        .filter(person -> person.getFirstName()
		                .equalsIgnoreCase("a"))
		        .findAny()
		        .map(person -> {
			        person.setAge(34);
			        return 34;
		        })
		        .orElse(null);

		System.out.println(age);
		System.out.println(personList);

	}
}
