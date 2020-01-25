package com.dhiren.inner;

class Test {
    public void taste() {
        System.out.println("Sour");
    }
}

public class AnonymousDemoV2 {
    public static void main(String[] args) {
        Test t1 = new Test() {
            public void taste() {
                System.out.println("Salty");
            }
        };

        Test t3 = new Test() {
            public void taste() {
                System.out.println("Sweet");
            }
        };

        Test t2 = new Test();

        t1.taste();
        t2.taste();
        t3.taste();
        System.out.println(t1.getClass().getName());
        System.out.println(t2.getClass().getName());
        System.out.println(t3.getClass().getName());
    }
}
