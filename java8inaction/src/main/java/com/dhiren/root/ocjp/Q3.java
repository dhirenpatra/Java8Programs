package com.dhiren.root.ocjp;

public class Q3 {

    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(null);
        Boolean b2 = Boolean.valueOf(false);
        System.out.print((b1 == b2) + " ");
        System.out.print(b1.equals(b2));
    }

}
