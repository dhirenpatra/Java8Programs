
package com.dhiren.root.miscelenous;

public class TypePromotion {

	public static void main(String[] args) {
		//fun();
	}

	// varargs method with float datatype
	static void fun(float... x) {
		System.out.println("float varargs");
	}

    // varargs method with long datatype
    static void fun(long... x) {
        System.out.println("long varargs");
    }

    // varargs method with boolean datatype
    static void fun(boolean... x) {
        System.out.println("boolean varargs");
    }

	// varargs method with int datatype
	static void fun(int... x) {
		System.out.println("int varargs");
	}

	// varargs method with double datatype
	static void fun(double... x) {
		System.out.println("double varargs");
	}
}
