
package com.dhiren.root.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronisedCodeProblem {

	private Random random = new Random();

	private List<Integer> integerListOne = new ArrayList<>();
	private List<Integer> integerListTwo = new ArrayList<>();

	private synchronized void stageOne() {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		integerListOne.add(random.nextInt(100));
	}

	private synchronized void stageTwo() {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		integerListTwo.add(random.nextInt(100));
	}

	private void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public static void main(String[] args) {
		new SynchronisedCodeProblem().main();
	}

	public void main() {
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> process());
        Thread thread2 = new Thread(() -> process());
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Duration : " + duration);
        System.out.println("Size of ListOne : " + integerListOne.size() + " Size of ListTwo : "
                + integerListTwo.size());
    }

}
