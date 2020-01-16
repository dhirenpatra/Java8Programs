package com.dhiren.io.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFiles {

    public static final String FILES_ZIPPED_PATH = "files/ints.zip";

    public static void main(String[] args) {
        //writeToZippedFile();
        readFromZippedFile();
    }

    private static void readFromZippedFile() {
        try(ZipInputStream zip = new ZipInputStream(new FileInputStream(new File(FILES_ZIPPED_PATH)));
            DataInputStream input = new DataInputStream(zip)) {

            ZipEntry entry = zip.getNextEntry();
            while (entry != null) {

                if(entry.isDirectory())
                    System.out.println("Reading Directory : "+entry);
                else {
                    if(entry.getName().endsWith(".bin")) {
                        System.out.println("Reading File .bin : "+entry.getName());
                        List<Integer> ints = new ArrayList<>();
                        try {
                            while (true)
                                ints.add(input.readInt());
                        } catch (EOFException e) {
                            System.out.println("File Contains "+ints.size()+ " numbers...");
                        }
                    } else if(entry.getName().endsWith(".txt")) {
                        System.out.println("Reading File .txt : : "+entry.getName());
                        final String content = input.readUTF();
                        System.out.println("File Contains "+content);
                    }
                }
                entry = zip.getNextEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToZippedFile() {
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(FILES_ZIPPED_PATH));
             DataOutputStream output = new DataOutputStream(zip);
        ) {
            ZipEntry zipEntry = new ZipEntry("bin/");
            zip.putNextEntry(zipEntry);

            ZipEntry zipFileEntry = new ZipEntry("bin/ints.bin");
            zip.putNextEntry(zipFileEntry);

            IntStream.range(1, 1001).forEach(v -> {
                try {
                    output.writeInt(v);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            ZipEntry textEntry = new ZipEntry("txt/");
            zip.putNextEntry(textEntry);

            ZipEntry textFileEntry = new ZipEntry("txt/test.txt");
            zip.putNextEntry(textFileEntry);

            output.writeUTF("Some random text added as a test case");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
