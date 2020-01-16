package com.dhiren.io.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WriterInAction {

    public static void main(String[] args) {
        writeToFile();
    }

    private static void writeToFile() {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("files/sample_three.txt"),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            PrintWriter write = new PrintWriter(writer);
            for(int i = 0 ; i < 10 ; i++) {
                Calendar calendar = GregorianCalendar.getInstance(Locale.ENGLISH);
                write.printf("Dhiren is not a good boy %1$tY %1$tA %1$tB",calendar);
                write.println();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
