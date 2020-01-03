package com.dhiren.io.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReaderInAction {
    public static void main(String[] args) {
        getInfo();
        readerOne();
        readerTwo();
        readerThree();
        readerFour();
    }

    private static void getInfo() {
        File no = getFile();
        System.out.println(no.exists());
        //no.createNewFile();
    }

    private static File getFile() {
        File file = new File("files/sample_one.txt");
        System.out.println(file.getName());
        return file;
    }

    private static Path getPath() {
        return Paths.get("files/sample_two.txt");
    }


    private static void readerOne() {
        try (Reader reader = new FileReader(getFile());) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readerTwo() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(getPath())) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readerThree() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(getPath())) {
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readerFour() {
        try (Stream<String> stream = Files.newBufferedReader(getPath()).lines()) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
