
package com.dhiren.root.multithreading.executor;

import com.dhiren.root.multithreading.executor.exception.RejectedTaskHandler;
import com.dhiren.root.multithreading.executor.service.ExecutorDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadRunner {
    public static void main(String[] args) {
        Runnable task1 = new ExecutorDemo("TASK-ONE");
        Runnable task2 = new ExecutorDemo("TASK-TWO");
        Runnable task3 = new ExecutorDemo("TASK-THREE");
        Runnable task4 = new ExecutorDemo("TASK-FOUR");
        Runnable task5 = new ExecutorDemo("TASK-FIVE");

        Runnable task6 = new ExecutorDemo("TASK-SIXXXXEEYYY");

        final ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        service.setRejectedExecutionHandler(new RejectedTaskHandler());
        service.execute(task1);
        service.execute(task2);
        service.execute(task3);
        service.execute(task4);
        service.execute(task5);

        service.shutdown();
        service.execute(task6);
    }
}
