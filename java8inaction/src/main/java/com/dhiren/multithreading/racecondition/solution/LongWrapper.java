package com.dhiren.multithreading.racecondition.solution;

public class LongWrapper {

    private Long count;
    private Object lock = new Object();

    public LongWrapper(Long count) {
        this.count = count;
    }

    public long getValue() {
        return count;
    }

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }
}
