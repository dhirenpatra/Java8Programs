package com.dhiren.io.serialization.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        String key = name + "::" +age;
        out.write(key.getBytes());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        byte[] buffer = new byte[1024];
        int read = in.read(buffer);
        String result = new String(buffer,0,read);
        name = result.split("::")[0];
        age = Integer.parseInt(result.split("::")[1]);
    }

}
