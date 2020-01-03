package com.dhiren.multithreading.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

    private static List<Integer> intArray = new ArrayList<>();
    private static Object lockObj = new Object();

    private static boolean isFull() {
        return intArray.size() == 10;
    }

    private static boolean isEmpty() {
        return intArray.isEmpty();
    }

    static class Producer {

        public void produce() throws InterruptedException {
            while (true) {
                synchronized (lockObj) {
                    while (isFull()){
                        lockObj.wait();
                        Thread.sleep(5000);
                    }
                    System.err.println("Thread is : "+Thread.currentThread().getName());
                    System.out.print("Producer produced - Now list contains --> ");
                    intArray.add(1);
                    System.out.println(intArray);
                    lockObj.notifyAll();
                    Thread.sleep(2000);
                    Thread.sleep(100);
                }
            }

        }

    }

    static class Consumer {

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (lockObj) {
                    while (isEmpty()) {
                        lockObj.wait();
                        Thread.sleep(5000);
                    }
                    System.err.println("Thread is : "+Thread.currentThread().getName());
                    System.out.print("Consumer consumed - Now list contains --> ");
                    intArray.remove(intArray.size() - 1);
                    System.out.println(intArray);
                    lockObj.notifyAll();
                    Thread.sleep(2000);
                }
            }
        }
    }

    public static void main(String[] args) {

        ProducerConsumer.Producer producer = new ProducerConsumer.Producer();
        ProducerConsumer.Consumer consumer = new ProducerConsumer.Consumer();

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

        Thread[] producerThreads = new Thread[2];
        Thread[] consumerThreads = new Thread[2];

        ProducerConsumerUsingLock.getThreadsStarted(producerRunnable, consumerRunnable, producerThreads, consumerThreads);

    }
}
