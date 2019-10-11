
package com.dhiren.root.multithreading;

public class ExecutingThreadInSeq extends Thread {

	@Override
	public void run() {
		System.err.println("Thread is " + this.currentThread()
		        .getName());
	}
}

class Main {
    public static void main(String[] args) {
        ExecutingThreadInSeq se1 = new ExecutingThreadInSeq();
        ExecutingThreadInSeq se2 = new ExecutingThreadInSeq();

        se1.start();
        try {
            se1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        se2.start();
    }
}