package com.dhiren.root.miscelenous;

public class OctalToDecimal {

    private static int convertOctalToDecimal(int number) {
        int base = 1;
        int decimalValue = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            decimalValue += lastDigit * base;
            base = base * 8;
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        System.err.println(convertOctalToDecimal(67));
    }

}
