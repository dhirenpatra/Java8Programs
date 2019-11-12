
package com.dhiren.root.innerClasses;

public class AnonymInnerClass {
	public void taste() {
		System.out.println("Salty");
	}

	public static void main(String[] args) {
        AnonymInnerClass inner = new AnonymInnerClass() {
            public void taste() {
                System.out.println("Spicy");
            }
        };

        AnonymInnerClass inner1 = new AnonymInnerClass() {
            public void taste() {
                System.out.println("Chocolaty");
            }
        };

        AnonymInnerClass inner2 = new AnonymInnerClass();

        inner.taste();
        inner1.taste();
        inner2.taste();

        System.err.println(inner.getClass().getName());
        System.err.println(inner1.getClass().getName());
        System.err.println(inner2.getClass().getName());
    }

}
