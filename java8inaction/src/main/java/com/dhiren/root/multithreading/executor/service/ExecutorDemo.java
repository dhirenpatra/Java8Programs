package com.dhiren.root.multithreading.executor.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExecutorDemo implements Runnable {

    private String name;

    public ExecutorDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
            if (i == 0) {
                System.err.println("Initialization Time for task name - " + name + " @ "
                        + format.format(new Date()));
            } else {
                System.out.println("Executing Time for task name - " + name + " @ "
                        + format.format(new Date()));
            }
        }
    }

    @Override
    public String toString() {
        return "ExecutorDemo{" +
                "name='" + name + '\'' +
                '}';
    }
}
