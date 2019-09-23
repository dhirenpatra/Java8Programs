package com.dhiren.root.conversions;

public class StringToInteger {

    public static void main(String[] args) {

        String storeNo = "00590";
        Integer store = Integer.parseInt(storeNo);

        String stores = Integer.valueOf(storeNo).toString();
        System.err.println(store);
        System.err.println(stores);
    }
}
