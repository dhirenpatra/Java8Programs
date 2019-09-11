
package com.dhiren.root.lambda;

import java.util.function.Function;

public class LambdaRunner {

	public static void main(String[] args) {

		Comparator<Person> personComparatorByAge = (p1, p2) -> p2.getAge() - p1.getAge();

		Function<Person, String> functionByFName = Person::getFirstName;

		Comparator<Person> personByAge = Comparator.comparing(Person::getAge);
		Comparator<Person> personByLName = Comparator.comparing(Person::getLastName);

		Comparator<Person> finalComparator = Comparator.comparing(Person::getLastName)
		        .thenComparing(Person::getFirstName)
		        .thenComparing(Person::getLastName);

	}
}
