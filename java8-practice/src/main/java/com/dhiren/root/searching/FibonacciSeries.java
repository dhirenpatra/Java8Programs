package com.dhiren.root.searching;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    private static void printSeries(int length) {
        int[] array = new int[length];
        array[0] = 0;
        array[1] = 1;
        System.err.println("length : "+length);
        for(int i = 2; i < length ; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the search");
        int length = scanner.nextInt();
        printSeries(length);
    }

}
