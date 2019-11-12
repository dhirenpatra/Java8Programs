package com.dhiren.multithreading.deadlock;

public class DeadlockDemo {

    public static void main(String[] args) {

        Deadlock deadlock = new Deadlock();

        Runnable runnableOne = () -> deadlock.a();
        Runnable runnableTwo = () -> deadlock.b();

        Thread threadOne = new Thread(runnableOne);
        threadOne.setName("Thread-One");

        Thread threadTwo = new Thread(runnableTwo);
        threadTwo.setName("Thread-Two");

        threadOne.start();
        threadTwo.start();
    }

}
