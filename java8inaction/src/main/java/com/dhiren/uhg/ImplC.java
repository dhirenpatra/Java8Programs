package com.dhiren.uhg;

interface BaseI {
    default void method() {
        System.out.println("BaseI ");
    };
}

class BaseC {
    public void method() {
        System.out.println("BaseC ");
    }
}

class ImplC extends BaseC implements BaseI{

    public static void main(String[] args) {
        (new ImplC()).method();
    }

}
