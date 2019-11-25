package com.dhiren.root.ocjp;

class Demo {
    String title = "Demo";
}

public class Test {
    public static void m1(Demo d) {
        d.title = "NewDemo";
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        m1(d);
        System.out.println(d.title);
    }
}