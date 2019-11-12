
package com.dhiren.root.lambda;

import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {

		// A function taking 2 arguments
		Function<Integer, Function<Integer, Integer>> add = a -> b -> a + b;

		// A function taking 3 arguments
		Function<Integer, Function<Integer, Function<Integer, Integer>>> addThree
		    = a -> b -> c -> a + b + c;

		System.err.println(add.apply(10)
		        .apply(20));

		System.err.println(addThree.apply(10)
		        .apply(20)
		        .apply(30));
	}
}
