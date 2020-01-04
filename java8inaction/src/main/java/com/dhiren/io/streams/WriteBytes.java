package com.dhiren.io.streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.zip.GZIPOutputStream;

public class WriteBytes {

    public static final String FILES_PATH = "files/ints.bin";
    public static final String FILES_ZIPPED_PATH = "files/ints.bin.gz";

    public static void main(String[] args) {
        writeToFile();
        writeToFileInGZip();
    }

    private static void writeToFileInGZip() {
        File file = new File(FILES_ZIPPED_PATH);
        Path path = Paths.get(FILES_ZIPPED_PATH);
        try(
            GZIPOutputStream zos = new GZIPOutputStream(new FileOutputStream(file));
            DataOutputStream dos = new DataOutputStream(zos)
        ) {
            IntStream.range(1,1001).forEach(value -> {
                try {
                    dos.writeInt(value);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(getSize(path)+ " is the file size of "+FILES_ZIPPED_PATH);
    }

    private static void writeToFile() {
        File file = new File(FILES_PATH);
        Path path = Paths.get(FILES_PATH);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            IntStream.range(1,1001).forEach(value -> {
                try {
                    dos.writeInt(value);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(getSize(path)+ " is the file size of "+FILES_PATH);
    }

    private static long getSize(Path path) {
        try {
            return Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
