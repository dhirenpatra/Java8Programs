package com.dhiren.multithreading.racecondition;

public class LongWrapper {

    private Long count;

    public LongWrapper(Long count) {
        this.count = count;
    }

    public long getValue() {
        return count;
    }

    public void increment() {
        count++;
    }
}
