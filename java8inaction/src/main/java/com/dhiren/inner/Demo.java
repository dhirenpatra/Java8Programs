package com.dhiren.inner;

class OuterClass {
    int a = 10;
    static int b = 20;
    public void m1() {
        int c = 30;
        final int d = 40;
        class Inner {
            public void m1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        }
        Inner inner = new Inner();
        inner.m1();
    }
}

public class Demo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.m1();
    }
}
