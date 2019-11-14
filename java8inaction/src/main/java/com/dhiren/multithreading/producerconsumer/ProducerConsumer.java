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
                    while (isFull())
                        lockObj.wait();
                    System.err.println("Thread is : "+Thread.currentThread().getName());
                    System.out.print("Producer produced - Now list contains --> ");
                    intArray.add(1);
                    System.out.println(intArray);
                    lockObj.notifyAll();
                    Thread.sleep(50);
                }
            }

        }

    }

    static class Consumer {

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (lockObj) {
                    while (isEmpty())
                        lockObj.wait();
                    System.err.println("Thread is : "+Thread.currentThread().getName());
                    System.out.print("Consumer consumed - Now list contains --> ");
                    intArray.remove(intArray.size() - 1);
                    System.out.println(intArray);
                    lockObj.notifyAll();
                    Thread.sleep(100);
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

        Thread[] producerThreads = new Thread[10000];
        Thread[] consumerThreads = new Thread[100];

        for (int i = 1 ; i < producerThreads.length ; i++) {

            producerThreads[i] = new Thread(producerRunnable);
            producerThreads[i].setName("Thread Producer -"+i);
            producerThreads[i].start();

            consumerThreads[i] = new Thread(consumerRunnable);
            consumerThreads[i].setName("Thread Consumer -"+i);
            consumerThreads[i].start();

        }
        for (int i = 1 ; i < producerThreads.length ; i++) {
            try {
                producerThreads[i].join();
                consumerThreads[i].join();
            } catch (InterruptedException e) {
            }
        }

    }
}
