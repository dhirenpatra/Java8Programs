package com.dhiren.root.basics;

import java.sql.SQLOutput;

class Constructor {
    static String str;

    private String name;

    public Constructor() {
        System.out.println("In constructor");
        str = "Hello World";
    }

    public Constructor(String name) {
        this();
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    public static void main(String[] args) {
        Constructor c = new Constructor("Dhiren");

        //c.Constructor();
        System.out.println(str);
    }
}