package com.dhiren.root.string;

public class ConfusionsOnString {

    public static void main(String[] args) {
        String s1 = new String("ab");
        String s2 = "ab";
        String s3 = s1;
        String s4 = s2;

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        System.out.println(s4.equals(s2));

        System.out.println(s1 == s2);
        System.out.println(s3 == s1);
        System.out.println(s4 == s2);
        System.out.println(s4 == s1);
        System.out.println(s3 == s2);
    }

}
