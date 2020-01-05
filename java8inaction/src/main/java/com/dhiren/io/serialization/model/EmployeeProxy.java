package com.dhiren.io.serialization.model;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;

public class EmployeeProxy implements Serializable {

    private static final long serialVersionUID = -8676055125426663203L;

    private String name;

    public EmployeeProxy() {
    }

    public EmployeeProxy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object readResolve() throws ObjectStreamException {

        return new Employee(name.split("\\$\\$")[0],
                Integer.parseInt(name.split("\\$\\$")[1]) );
    }

    @Override
    public String toString() {
        return "EmployeeProxy{" +
                "name='" + name + '\'' +
                '}';
    }



}
