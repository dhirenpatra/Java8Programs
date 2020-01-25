package com.dhiren.root.exception;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
    }
}
