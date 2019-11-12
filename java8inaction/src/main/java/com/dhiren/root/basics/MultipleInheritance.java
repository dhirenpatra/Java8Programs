package com.dhiren.root.basics;

interface i1 {
    void m1();
    default void m3() {
        System.err.println("Default in i2");
    }
}

interface i2 {
    void m1();
    default void m2() {
        System.err.println("Default in i2");
    }
}

public class MultipleInheritance implements i1,i2{

    @Override
    public void m1() {
        System.out.println("m1()");
    }

}
