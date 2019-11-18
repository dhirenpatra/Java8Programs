package com.dhiren.root.basics;


class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
}

public class MainClass {
    public static void main(String[] args) {
        try {
            throw new Exc1();
        } catch (Exc0 e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        }
    }
}
