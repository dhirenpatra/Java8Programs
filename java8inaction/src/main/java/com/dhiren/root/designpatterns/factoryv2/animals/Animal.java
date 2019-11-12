package com.dhiren.root.designpatterns.factoryv2.animals;

public interface Animal {

    default void eat(){
        System.out.println("Eating");
    }
    default void sleep(){
        System.out.println("Sleeping");
    }

    void whoAmI();

}
