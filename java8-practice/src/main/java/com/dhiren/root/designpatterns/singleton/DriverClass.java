package com.dhiren.root.designpatterns.singleton;

public class DriverClass {

    public static void main(String[] args) {
        MySingleton singletonOne = MySingleton.getInstance();
        MySingleton singletonTwo = MySingleton.getInstance();
        System.err.println(singletonOne);
        System.err.println(singletonTwo);
    }

}
