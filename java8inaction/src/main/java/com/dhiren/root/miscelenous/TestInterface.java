package com.dhiren.root.miscelenous;

import java.rmi.ServerError;

public interface TestInterface {

    void run();

    static void main(String[] args) {
        TestInterface testInterface = new TestInterface() {
            @Override
            public void run() {
                System.err.println("Testing runner");
            }
        };
        testInterface.run();
    }

}
