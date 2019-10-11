package com.dhiren.root.multithreading;

public class NewThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Name "+currentThread().getName());
    }

}

class MainMain {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.run();
    }
}
