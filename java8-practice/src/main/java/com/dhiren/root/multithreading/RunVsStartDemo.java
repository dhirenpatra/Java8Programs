package com.dhiren.root.multithreading;

class MyThreadDemo extends Thread {
    public void run()
    {
        System.out.println("Current thread name: "
                + Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}

public class RunVsStartDemo {

    public static void main(String[] args) {
        MyThreadDemo demo = new MyThreadDemo();
        demo.setName("Thread-called-with-start");
        MyThreadDemo demo1 = new MyThreadDemo();
        demo1.setName("Thread-called-with-run");
        demo.start();
        demo1.run();
    }

}
