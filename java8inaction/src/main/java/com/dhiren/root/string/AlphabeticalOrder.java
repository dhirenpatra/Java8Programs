package com.dhiren.root.string;

import java.util.Arrays;

public class AlphabeticalOrder {

    private static boolean isInAlphabeticalOrder(String inputString) {
        int size = inputString.length();
        char[] chars = new char[size];
        for(int i = 0; i < size; i++) {
            chars[i] = inputString.charAt(i);
        }
        System.err.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.err.println(Arrays.toString(chars));
        for(int i = 0; i < size; i++) {
            if(chars[i] != inputString.charAt(i))
                return false;
        }
        return true;
    }

    private static boolean isInAlphabeticalOrder_2(String inputString) {
        int size = inputString.length();
        for(int i = 1 ; i < size ; i++) {
            if(inputString.charAt(i) < inputString.charAt(i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.err.println(isInAlphabeticalOrder("aabbcccddfffffd"));
        System.err.println(isInAlphabeticalOrder_2("aabbcccddfffffd"));
        System.err.println(isInAlphabeticalOrder("aabbcccddfffff"));
        System.err.println(isInAlphabeticalOrder_2("aabbcccddfffff"));
    }

}
