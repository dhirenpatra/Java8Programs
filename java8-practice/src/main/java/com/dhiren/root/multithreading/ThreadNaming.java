package com.dhiren.root.multithreading;

public class ThreadNaming extends Thread {
    public ThreadNaming(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Current thread Name is : "+currentThread().getName());
    }
}

class Driver {
    public static void main(String[] args) {
        ThreadNaming name = new ThreadNaming("ThreadOne");
        name.start();
        ThreadNaming name1 = new ThreadNaming("ThreadOne");
        name1.start();
        name1.setName("ThreadTwo");
    }
}
