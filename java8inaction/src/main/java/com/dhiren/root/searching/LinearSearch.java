package com.dhiren.root.searching;

import java.util.Scanner;

public class LinearSearch {

    private static boolean linearSearch(int[] array , int searchElement) {
        for(int start=0; start<array.length; start++) {
            System.err.println("Now searching at index : "+start);
            if(array[start] == searchElement) {
                System.err.println("Element found at index : "+start);
                return true;
            }
        }
        System.err.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        int[] intArray = {21,32,43,56,87,97,34,52,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an element to search");
        int element = scanner.nextInt();
        linearSearch(intArray, element);
    }
}
