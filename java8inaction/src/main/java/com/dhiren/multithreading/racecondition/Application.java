package com.dhiren.multithreading.racecondition;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        LongWrapper wrapper = new LongWrapper(0l);

        Runnable runnable = () -> {
          for (int i = 0; i < 1_000; i++)
              wrapper.increment();
        };

        Thread[] threads = new Thread[1_000];
        for (int i = 0; i < 1_000; i++) {
            threads[i] = new Thread(runnable);
            threads[i].setName("Thread - "+i);
            threads[i].start();
        }
        for (int i = 0; i < 1_000; i++) {
            threads[i].join();
        }
        System.out.println("The final result is " +wrapper.getValue());
    }

}
