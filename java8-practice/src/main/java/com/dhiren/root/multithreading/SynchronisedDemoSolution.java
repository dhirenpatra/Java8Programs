package com.dhiren.root.multithreading;

public class SynchronisedDemoSolution {

    private volatile int count;

    private synchronized void incrementCount() {
        count ++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronisedDemoSolution demo = new SynchronisedDemoSolution();
        demo.doWork();
    }

    private void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    incrementCount();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    incrementCount();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.err.println("Count :" +count);
        System.err.println("Count :" +count);
        System.err.println("Count :" +count);

    }
}
