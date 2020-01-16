package com.dhiren.interviews;

import java.util.HashSet;
import java.util.Set;

public class SubStringsOfAString {

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        addAllCombinations("geek", "");
        System.out.println(set);
    }

    private static void addAllCombinations(String str, String ans) {
    }

}
