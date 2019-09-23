package com.dhiren.root.multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Run of Thread");
    }

    @Override
    public synchronized void start() {
        System.out.println("Start of Thread");
    }
}

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Run of Runnable");
    }

    public void start() {
        System.out.println("Start of Runnable");
    }
}

public class ThreadRunnableDemo {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

    }
}
