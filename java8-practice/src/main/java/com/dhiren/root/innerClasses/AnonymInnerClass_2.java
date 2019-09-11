
package com.dhiren.root.innerClasses;

public class AnonymInnerClass_2 implements Runnable {

	@Override
	public void run() {
		System.err.println("MyRunnable Implementation");
	}

	public static void main(String[] args) {

        AnonymInnerClass_2 runnable = new AnonymInnerClass_2();
        new Thread(runnable).start();

        Runnable run = () -> System.err.println("Lambda Implementation");
        new Thread(run).start();
	}

}
