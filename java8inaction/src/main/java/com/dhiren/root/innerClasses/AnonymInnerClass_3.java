
package com.dhiren.root.innerClasses;

public class AnonymInnerClass_3 {

	public static void main(String[] args) {

        new Thread(new Runnable() {
			@Override
			public void run() {
				System.err.println("Method Argument anonymous inner class");
			}
		}).start();

		new Thread(() -> {
			System.err.println("Method Argument lambda expression");
		}).start();
	}

}
