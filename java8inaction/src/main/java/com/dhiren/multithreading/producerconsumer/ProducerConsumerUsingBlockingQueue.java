package com.dhiren.multithreading.producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

    private static BlockingQueue<Integer> integerBlockingQueue = new LinkedBlockingQueue<>(10);

    public static void main(String[] args) {
        Producer producer = new Producer(integerBlockingQueue);
        Consumer consumer = new Consumer(integerBlockingQueue);
        producer.start();
        consumer.start();
    }

    static class Consumer extends Thread {

        private BlockingQueue<Integer> integerBlockingQueue = new LinkedBlockingQueue<>();

        public Consumer(BlockingQueue<Integer> integerBlockingQueue) {
            this.integerBlockingQueue = integerBlockingQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println(integerBlockingQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Producer extends Thread {

        private BlockingQueue<Integer> integerBlockingQueue = new LinkedBlockingQueue<>();

        public Producer(BlockingQueue<Integer> integerBlockingQueue) {
            this.integerBlockingQueue = integerBlockingQueue;
        }

        @Override
        public void run() {
            for (int i = 0 ; i < 10 ; i++) {
                integerBlockingQueue.add(new Random(21).nextInt());
            }
        }
    }

}




