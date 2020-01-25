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

    static int n1 = 0 , n2 = 1 , n3;
    private static void printSeriesInRecursion(int number) {

        if(number > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print( " "+n3);
            printSeriesInRecursion(number - 1);
        }
    }

    public static void main(String[] args) {
        int length = 12;
        printSeries(length);
        printSeriesInRecursion(12);
    }

}
