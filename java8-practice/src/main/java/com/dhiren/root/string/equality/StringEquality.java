package com.dhiren.root.string.equality;

public class StringEquality {

    public static void main(String[] args) {
        System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        StringBuffer sb1 = new StringBuffer("GFG");
        StringBuffer sb2 = new StringBuffer("GFG");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1 == sb2);

        System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@");

        String s1 = "GFG";
        String s2 = "GFG";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@");

        String s11 = "GFG";
        StringBuffer sb11 = new StringBuffer("GFG");
        System.out.println(s11.equals(sb11));

        System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@");

        String s4 = "GFG";
        StringBuffer sb21 = new StringBuffer("GFG");
        String s3 = sb21.toString();
        System.out.println(s4.equals(s3));
        System.out.println(s4 == s3);

    }

}
