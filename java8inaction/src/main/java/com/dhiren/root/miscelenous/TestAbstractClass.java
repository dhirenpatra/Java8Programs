package com.dhiren.root.miscelenous;

public abstract class TestAbstractClass {

    abstract void run();

    public static void main(String[] args) {
        TestAbstractClass testInterface1 = new MyClass();
        TestAbstractClass testInterface = new TestAbstractClass() {
            @Override
            public void run() {
                System.err.println("Testing runner from TestAbstractClass");
            }
        };
        testInterface.run();
        testInterface1.run();
    }

}

class MyClass extends TestAbstractClass {

    @Override
    void run() {
        System.err.println("Implemented");
        MyClass.main(new String[]{"a"});
    }

}
