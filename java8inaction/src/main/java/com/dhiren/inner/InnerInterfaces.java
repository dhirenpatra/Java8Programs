package com.dhiren.inner;

interface i1 {
    public void m1();
    interface i2 {
        public void m2();
    }
}

class TestOne implements i1{

    @Override
    public void m1() {
        System.out.println("Outer Impl");
    }
}

class TestTwo implements i1.i2 {

    @Override
    public void m2() {
        System.out.println("Inner Impl");
    }
}

public class InnerInterfaces {
    public static void main(String[] args) {
        TestOne one = new TestOne();
        one.m1();
        TestTwo two = new TestTwo();
        two.m2();
    }
}
