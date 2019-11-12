package com.dhiren.root;

public enum Enums {
    MONDAY
}
class Mains {
    public static void main(String[] args) {
        Enums monday = Enums.valueOf("MONDAY");
        System.err.println(monday);
        System.err.println(Enums.MONDAY.name());
    }
}

