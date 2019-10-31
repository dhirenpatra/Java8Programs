package com.dhiren.root.arrays;

import java.util.Arrays;

public class DuplicatesInArray {

    private static void findDuplicateFromArray(int[] array) {
        for(int index = 0 ; index < array.length ; index++) {
            if(array[Math.abs(array[index])] > 0) {
                array[Math.abs(array[index])] = -array[Math.abs(array[index])];
            } else {
                System.out.println(Math.abs(array[index]) + " is duplicate in this array.");
            }
        }
    }

    private static void findFirstTwoDuplicateFromArray(int[] array) {
        int counter = 0 ;
        for(int index = 0 ; index < array.length ; index++) {
            if(array[Math.abs(array[index])] > 0) {
                array[Math.abs(array[index])] = -array[Math.abs(array[index])];
            } else {
                counter ++;
                System.out.println(Math.abs(array[index]) + " is duplicate in this array.");
                if (counter == 2 )
                    break;
            }
        }
    }

    private static void findNDuplicateFromArray(int[] array, int n) {
        int counter = 0 ;
        for(int index = 0 ; index < array.length ; index++) {
            if(array[Math.abs(array[index])] > 0) {
                array[Math.abs(array[index])] = -array[Math.abs(array[index])];
            } else {
                counter ++;
                System.out.println(Math.abs(array[index]) + " is duplicate in this array.");
                if (counter == n )
                    break;
            }
        }
    }

    public static void main(String[] args) {
        findDuplicateFromArray(new int[]{1,2,3,2,1,3,4,5,4,6});
        System.out.println("******************************************");
        findFirstTwoDuplicateFromArray(new int[]{1,2,3,2,1,3,4,5,4,6});
        System.out.println("******************************************");
        findNDuplicateFromArray(new int[]{1,2,3,2,1,3,4,5,4,6} , 3);
    }

}
