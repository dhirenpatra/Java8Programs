package com.dhiren.root.basics;

public class ConstructorTest extends Thread {

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        ConstructorTest test = new ConstructorTest();
        ConstructorTest test1 = new ConstructorTest();

        test.run();
        test1.run();
    }
}
