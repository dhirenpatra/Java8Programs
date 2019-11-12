package com.dhiren.root.hackerrank.minSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinSubstringWithAllDistinctChar {

    private static int minLength(String str) {
        char[] charArray = str.toCharArray();
        String substring = "";
        Map<Character, Boolean> charSet = new HashMap<>();
        for (char ch : charArray) {
            charSet.put(ch, false);
        }
        // aabcce

        for (int index = 0; index < charArray.length; index++) {
            substring = substring + charArray[index];
            charSet.put(charArray[index], true);
            if(charSet.get(charArray[index]) == true) {
                if(charArray[0] == charArray[index]) {
                    substring = substring.substring(substring.length() - index);
                }
            }
        }
        System.err.println(substring);
        return 0;
    }

    public static void main(String[] args) {
        minLength("aabcce");
        minLength("bcbaabcebf");
        minLength("bcabacbc");
    }
}
