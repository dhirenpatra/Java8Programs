package com.dhiren.root.lambda;

import java.util.Arrays;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class BasicLambda {

    public void test() {

        final int[] intarray = {1,2,3,4,5};
        final String name = "DhIrEn";
        final Integer age = 20;
        final int r = 10;

        //Error r= 98;
        //Error name = "Dhiren";
        //Error age =24;

        intarray[0] = 21;
        System.err.println(Arrays.toString(intarray));
    }

    public static void main(String[] args) {
        BasicLambda lambda = new BasicLambda();
        lambda.test();
        final Student student = new Student("Dhiren");
        student.setName("Dhiren Kumar");
        System.err.println(student);
    }

}
