package com.dhiren.io.serialization;

import com.dhiren.io.serialization.model.Employee;
import com.dhiren.io.serialization.model.Person;
import com.dhiren.io.serialization.model.Student;
import com.dhiren.io.serialization.model.Teacher;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteDataObject {

    private static String fileName = "files/person.bin";
    private static File file = new File(fileName);

    private static String fileName1 = "files/person_write.bin";
    private static File file1 = new File(fileName1);

    private static String fileName2 = "files/student_write_ext.bin";
    private static File file2 = new File(fileName2);

    private static String fileName3 = "files/emp_proxy.bin";
    private static File file3 = new File(fileName3);

    public static void main(String[] args) {
        serializeObject();
        customSerializeObject();
        externalizeObject();
        serializeObjectUsingProxy();
    }

    private static void serializeObjectUsingProxy() {
        try (OutputStream os = new FileOutputStream(file3);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {

            oos.writeObject(new Employee("Rohit", 30));

        } catch (IOException e) {
        }

        printSize(fileName3);
    }

    private static void serializeObject() {
        try (OutputStream os = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {

            oos.writeObject(getPersons());

        } catch (IOException e) {
        }

        printSize(fileName);
    }

    private static void customSerializeObject() {
        try (OutputStream os = new FileOutputStream(file1);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {

            oos.writeObject(getTeachers());

        } catch (IOException e) {
        }

        printSize(fileName1);
    }

    private static void externalizeObject() {
        try (OutputStream os = new FileOutputStream(file2);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {

            oos.writeObject(getStudents());

        } catch (IOException e) {
        }

        printSize(fileName2);
    }

    private static List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Dhiren", 26));
        personList.add(new Person("Disha", 29));
        return personList;
    }

    private static List<Student> getStudents() {
        List<Student> personList = new ArrayList<>();
        personList.add(new Student("Virat", 26));
        personList.add(new Student("Anushka", 29));
        return personList;
    }

    private static List<Teacher> getTeachers() {
        List<Teacher> personList = new ArrayList<>();
        personList.add(new Teacher("Dhiren", 26));
        personList.add(new Teacher("Anushka", 29));
        return personList;
    }

    private static void printSize(String fileName) {
        try {
            System.out.println("File size : " + Files.size(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
