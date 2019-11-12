package com.dhiren.root.basics;

class GrandParent {
    int x = 10;
    public void m1() {
        System.out.println("Grand Parent m1()");
    }
}

class Parent extends GrandParent{
    int x = 20;
    public void m1() {
        System.out.println("Parent m1()");
    }
}

class Child extends Parent{
    int x = 30;
    public void m1() {
        System.out.println("Child m1()");
    }
}

public class PolymerphismDemo {

    public static void main(String[] args) {
        GrandParent grandParent ;

        grandParent = new Parent();
        grandParent.m1();
        System.out.println(grandParent.x);

        grandParent = new Child();
        grandParent.m1();
        System.out.println(grandParent.x);
    }

}