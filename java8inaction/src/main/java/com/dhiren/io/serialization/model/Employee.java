package com.dhiren.io.serialization.model;

import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Object writeReplace() throws ObjectStreamException {
        return new EmployeeProxy(name + ";" +age);
    }

}
