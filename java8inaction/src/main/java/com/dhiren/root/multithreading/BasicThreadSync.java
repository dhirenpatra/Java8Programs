package com.dhiren.root.multithreading;

import java.util.Scanner;

class Process extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {

        while (running) {
            System.err.println("Hello from : "+currentThread());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdownThread() {
        running = false;
    }
}

public class BasicThreadSync {

    public static void main(String[] args) {
        Process process = new Process();
        process.start();
        System.out.println("Press Enter/Return key to stop the thread.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        process.shutdownThread();
    }

}
