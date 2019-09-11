
package com.dhiren.root.innerClasses;

public class MethodLocalInnerClass_2 {

	private int factor = 10;

	public int addNumbers(int x, int y) {

		final int newFactor = 10;

		class SumOfIntegers {

			public int sumAndFactor(int x, int y) {
				return (x + y) * factor;
			}

			public int getLocalVariable() {
				return newFactor;
			}

		}

		SumOfIntegers sumOfIntegers = new SumOfIntegers();
		System.err.println(sumOfIntegers.getLocalVariable());
		return sumOfIntegers.sumAndFactor(x, y);
	}

	public static void main(String[] args) {

		MethodLocalInnerClass_2 clazz = new MethodLocalInnerClass_2();
		int addNumbers1 = clazz.addNumbers(10, 20);
		System.out.println("[ " + addNumbers1 + " ] ");
	}

}
