package com.dhiren.inner;

interface Taste {
    default void m1() {
        System.out.println("Sweet");
    }

    public abstract void taste();
}

public class AnonymousDemo {
    public static void main(String[] args) {
        Taste t1 = new Taste() {
            public void taste() {
                System.out.println("Salty");
            }
        };

        Taste t2 = () -> System.out.println("afs");

        t1.taste();
    }
}
