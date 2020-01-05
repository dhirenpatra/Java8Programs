package com.dhiren.io.serialization.model;

import java.io.*;

public class Teacher implements Serializable {

    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void writeObject(ObjectOutputStream oos) throws Exception {
        DataOutputStream dos = new DataOutputStream(oos);
        dos.writeUTF(name + "::" +age);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        DataInputStream dis = new DataInputStream(ois);
        final String result = dis.readUTF();
        name = result.split("::")[0];
        age = Integer.parseInt(result.split("::")[1]);
    }

}
