package com.dhiren.multithreading.producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerUsingLock {

    private static List<Integer> intArray = new ArrayList<>();
    private static Lock lockObj = new ReentrantLock();
    private static Condition emptyCondition = lockObj.newCondition();
    private static Condition fullCondition = lockObj.newCondition();

    private static boolean isFull() {
        return intArray.size() == 10;
    }

    private static boolean isEmpty() {
        return intArray.isEmpty();
    }

    static class Producer {
        public void produce() throws InterruptedException {
            while (true) {
                lockObj.lock();
                try {
                    while (isFull()) {
                        System.out.println(Thread.currentThread().getName() + " : Buffer is full, waiting");
                        fullCondition.await();
                    }
                    System.err.println("Thread is : " + Thread.currentThread().getName());
                    System.out.print("Producer produced - Now list contains --> ");
                    intArray.add(new Random().nextInt());
                    System.out.println(intArray);
                    emptyCondition.signalAll();
                    Thread.sleep(200);
                } finally {
                    lockObj.unlock();
                }
            }
        }
    }

    static class Consumer {
        public void consume() throws InterruptedException {
            while (true) {
                lockObj.lock();
                try {
                    while (isEmpty()) {
                        emptyCondition.await();
                    }
                    System.err.println("Thread is : " + Thread.currentThread().getName());
                    System.out.print("Consumer consumed - Now list contains --> ");
                    intArray.remove(intArray.size() - 1);
                    System.out.println(intArray);
                    fullCondition.signalAll();
                    Thread.sleep(500);
                } finally {
                    lockObj.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {

        ProducerConsumerUsingLock.Producer producer = new ProducerConsumerUsingLock.Producer();
        ProducerConsumerUsingLock.Consumer consumer = new ProducerConsumerUsingLock.Consumer();

        Runnable producerRunnable = () -> {
            try {
                producer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumerRunnable = () -> {
            try {
                consumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread[] producerThreads = new Thread[5];
        Thread[] consumerThreads = new Thread[5];

        getThreadsStarted(producerRunnable, consumerRunnable, producerThreads, consumerThreads);

    }

    static void getThreadsStarted(Runnable producerRunnable, Runnable consumerRunnable, Thread[] producerThreads, Thread[] consumerThreads) {
        for (int i = 1; i < producerThreads.length; i++) {

            producerThreads[i] = new Thread(producerRunnable);
            producerThreads[i].setName("Thread Producer -" + i);
            producerThreads[i].start();

            consumerThreads[i] = new Thread(consumerRunnable);
            consumerThreads[i].setName("Thread Consumer -" + i);
            consumerThreads[i].start();

        }
        for (int i = 1; i < producerThreads.length; i++) {
            try {
                producerThreads[i].join();
                consumerThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
