package com.dhiren.root.designpatterns.builder;

public class DriverClass {

    public static void main(String[] args) {
        Student.Builder builder = new Student.Builder();
        Student dhiren = builder.name("Dhiren").city("Bangalore").country("India").build();
        Student disha = builder.name("Disha").city("Mumbai").country("India").course("BE").build();
        System.err.println(dhiren);
        System.err.println(disha);
    }

}
