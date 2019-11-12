package com.dhiren.multithreading.deadlock;

public class Deadlock {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void a() {
        synchronized (lock1) {
            System.out.println("a() called by "+Thread.currentThread().getName());
            b();
        }
    }

    public void b() {
        synchronized (lock2) {
            System.out.println("b() called by "+Thread.currentThread().getName());
            c();
        }
    }

    public void c() {
        synchronized (lock1) {
            System.out.println("c() called by "+Thread.currentThread().getName());
        }
    }

}
