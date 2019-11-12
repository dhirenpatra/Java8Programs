
package com.dhiren.root.innerClasses;

public class MethodLocalInnerClass {

	private int factor = 10;

	public int addNumbers(int x, int y) {

		class SumOfIntegers {

			public int sumAndFactor(int x, int y) {
				return (x + y) * factor;
			}

		}

		SumOfIntegers sumOfIntegers = new SumOfIntegers();
		return sumOfIntegers.sumAndFactor(x, y);
	}

	public static void main(String[] args) {

		MethodLocalInnerClass clazz = new MethodLocalInnerClass();
		int addNumbers1 = clazz.addNumbers(10, 20);
		int addNumbers2 = clazz.addNumbers(100, 200);
		int addNumbers3 = clazz.addNumbers(11, 22);
		System.out.println("[ " + addNumbers1 + " , " + addNumbers2 + " , " + addNumbers3 + " ] ");
	}

}
