package com.dhiren.root.designpatterns.factoryv2.factory;

import com.dhiren.root.designpatterns.factoryv2.animals.Animal;
import com.dhiren.root.designpatterns.factoryv2.animals.AnimalType;
import com.dhiren.root.designpatterns.factoryv2.animals.Elephant;
import com.dhiren.root.designpatterns.factoryv2.animals.Tiger;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType type) {
        switch (type) {
            case VEGETARIAN: {
                return new Elephant();
            }
            case NON_VEGETARIAN: {
                return new Tiger();
            }
            default:
                return null;
        }
    }
}
