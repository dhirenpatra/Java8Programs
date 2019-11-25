package com.dhiren.root.multithreading;

class ThreadOne extends Thread{

    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTwo extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread Interrupted "+currentThread().getName());
            }
        }
    }
}

class ThreadThree extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Counting .... "+i);
        }
    }
}

class ThreadDriver {
    public static void main(String[] args) {
        ThreadOne one = new ThreadOne();
        one.setName("thread-1");
        ThreadTwo two = new ThreadTwo();
        two.setName("thread-2");
        ThreadThree three = new ThreadThree();
        three.setName("thread-3");

        one.start();
        one.interrupt();
        two.start();
        two.interrupt();
        three.start();
        three.interrupt();
        //three.interrupt();

        System.out.println("Thread 3 is interrupted ?? "+three.isInterrupted());
        System.out.println("Thread 2 is interrupted ?? "+two.isInterrupted());
        System.out.println("Thread 1 is interrupted ?? "+one.isInterrupted());
    }
}
