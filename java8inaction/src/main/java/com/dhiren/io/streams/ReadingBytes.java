package com.dhiren.io.streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

public class ReadingBytes {

    public static final String FILES_PATH = "files/ints.bin";
    public static final String FILES_ZIPPED_PATH = "files/ints.bin.gz";

    public static void main(String[] args) {
        readNormal();
        readZipped();
    }

    private static void readZipped() {
        Path path = Paths.get(FILES_ZIPPED_PATH);
        getSize(path);
        try(GZIPInputStream zgip = new GZIPInputStream(new FileInputStream(FILES_ZIPPED_PATH))) {
            readOperation(new DataInputStream(zgip));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readOperation(DataInput input) throws IOException {
        List<Integer> intList = new ArrayList<>();
        try {
            while (true) {
                intList.add(input.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Total numbers read is "+intList.size());
        }
    }

    private static void readNormal() {
        Path path = Paths.get(FILES_PATH);
        getSize(path);
        try (InputStream is = new FileInputStream(new File(FILES_PATH))) {
            readOperation(new DataInputStream(is));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long getSize(Path path) {
        try {
            long size = Files.size(path);
            System.out.println(size + " bytes is the file size ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
