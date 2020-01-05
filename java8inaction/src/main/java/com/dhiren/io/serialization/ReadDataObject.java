package com.dhiren.io.serialization;

import com.dhiren.io.serialization.model.Employee;
import com.dhiren.io.serialization.model.Person;
import com.dhiren.io.serialization.model.Student;
import com.dhiren.io.serialization.model.Teacher;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDataObject {

    private static String fileName = "files/person.bin";
    private static File file = new File(fileName);

    private static String fileName1 = "files/person_write.bin";
    private static File file1 = new File(fileName1);

    private static String fileName2 = "files/student_write_ext.bin";
    private static File file2 = new File(fileName2);

    private static String fileName3 = "files/emp_proxy.bin";
    private static File file3 = new File(fileName3);

    public static void main(String[] args) {
        deSerializeObject();
        customDeSerializeObject();
        deExternalizeObject();
        deSerializeObjectUsingProxy();
    }

    private static void deSerializeObjectUsingProxy() {
        try (InputStream is = new FileInputStream(file3);
             ObjectInputStream ois = new ObjectInputStream(is)) {

            Employee emp = (Employee) ois.readObject();
            System.out.println(emp);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        printSize(fileName3);
    }

    private static void deSerializeObject() {
        try (InputStream is = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(is)) {

            List<Person> personList = (List<Person>) ois.readObject();
            personList.forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        printSize(fileName);
    }

    private static void customDeSerializeObject() {
        try (InputStream is = new FileInputStream(file1);
             ObjectInputStream ois = new ObjectInputStream(is)) {

            List<Teacher> teachers = (List<Teacher>) ois.readObject();
            teachers.forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
        }

        printSize(fileName1);
    }

    private static void deExternalizeObject() {
        try (InputStream is = new FileInputStream(file2);
             ObjectInputStream ois = new ObjectInputStream(is)) {

            List<Student> students = (List<Student>) ois.readObject();
            students.forEach(System.out::println);


        } catch (IOException | ClassNotFoundException e) {
        }

        printSize(fileName2);
    }

    private static List<Person> getPersons() {
        return Arrays.asList(new Person("Dhiren", 26)
                , new Person("Disha", 29));
    }

    private static List<Student> getStudents() {
        return Arrays.asList(new Student("Virat", 30)
                , new Student("Anushka", 29));
    }

    private static void printSize(String fileName) {
        try {
            System.out.println("File size : " + Files.size(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
