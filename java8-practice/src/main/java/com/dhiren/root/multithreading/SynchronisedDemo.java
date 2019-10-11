package com.dhiren.root.multithreading;

public class SynchronisedDemo {

    private volatile int count;
    public static void main(String[] args) throws InterruptedException {
        SynchronisedDemo demo = new SynchronisedDemo();
        demo.doWork();
    }

    private void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    count++;
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    count++;
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
