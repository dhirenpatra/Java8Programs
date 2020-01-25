package com.dhiren.root.basics;

interface Static {
    static void m1(){
        System.out.println("Static method");
    }
    default void m2() {
        System.out.println("Default Method");
    }
}

public class StaticInterfaceMethods {
    public static void main(String[] args) {
        Static.m1();
    }
}
