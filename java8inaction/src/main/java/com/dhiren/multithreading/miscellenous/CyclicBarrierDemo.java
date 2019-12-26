package com.dhiren.multithreading.miscellenous;

import java.rmi.ServerError;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    private static CyclicBarrier barrier = new CyclicBarrier(3, () -> System.err.println("Barrier Broken"));

    public static void main(String[] args) {
        OperationOne one = new OperationOne("Op-1", barrier);
        OperationTwo two = new OperationTwo("Op-2", barrier);
        OperationThree three = new OperationThree("Op-3", barrier);
        one.start();
        two.start();
        three.start();
    }

    static class OperationOne extends Thread {

        private CyclicBarrier barrier;

        public OperationOne(String name, CyclicBarrier barrier) {
            super(name);
            this.barrier = barrier;
        }

        @Override
        public void run() {
            System.out.println("Executing thread : "+currentThread().getName());
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("Multiplying Numbers ...");
        }
    }

    static class OperationTwo extends Thread {
        private CyclicBarrier barrier;

        public OperationTwo(String name, CyclicBarrier barrier) {
            super(name);
            this.barrier = barrier;
        }
        @Override
        public void run() {
            System.out.println("Executing thread : "+currentThread().getName());
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("Adding Numbers ...");
        }
    }

    static class OperationThree extends Thread {
        private CyclicBarrier barrier;

        public OperationThree(String name, CyclicBarrier barrier) {
            super(name);
            this.barrier = barrier;
        }
        @Override
        public void run() {
            System.out.println("Executing thread : "+currentThread().getName());
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("Dividing Numbers ...");
        }
    }
}
