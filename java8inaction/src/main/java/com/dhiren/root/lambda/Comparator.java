
package com.dhiren.root.lambda;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

	int compareObjects(T t1, T t2);

	default Comparator<T> thenComparing(Comparator<T> comparator) {
		return (p1, p2) -> compareObjects(p1, p2) == 0 ? comparator.compareObjects(p1, p2)
		    : compareObjects(p1, p2);
	}

	default Comparator<T> thenComparing(Function<T, Comparable> function) {
		return thenComparing(comparing(function));
	}

	static <U> Comparator<U> comparing(Function<U, Comparable> function) {
		return (p1, p2) -> function.apply(p1)
		        .compareTo(function.apply(p2));
	}

}
