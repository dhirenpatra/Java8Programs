package com.dhiren.multithreading.miscellenous;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    private static CountDownLatch latch = new CountDownLatch(4);

    public static void main(String[] args) {
        Worker workerOne = new Worker(latch, 1000, "Thread-1");
        Worker workerTwo = new Worker(latch, 1000, "Thread-2");
        Worker workerThree = new Worker(latch, 1000, "Thread-3");
        Worker workerFour = new Worker(latch, 1000, "Thread-4");
        workerOne.start();
        workerTwo.start();
        workerThree.start();
        workerFour.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed Successfully...");
    }

    static class Worker extends Thread {

        private CountDownLatch countDownLatch;
        private long delay;
        private String name;

        public Worker(CountDownLatch countDownLatch, long delay, String name) {
            this.countDownLatch = countDownLatch;
            this.delay = delay;
            this.name = name;
        }

        @Override
        public void run() {
            System.err.println(countDownLatch.getCount());
            System.err.println("Completing task...");
            countDownLatch.countDown();
            System.err.println("Completed task...");
        }

    }

}
