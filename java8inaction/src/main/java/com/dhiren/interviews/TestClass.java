package com.dhiren.interviews;

class A {
    int i;
    private int j;
    void setIJ(int x, int y){
        i = x;
        j = y;
    }
}
class B extends  A {
    int total;
    public int sum(int x, int y) {
        // j has private access in Parent class
        //total = i + j;
        return 0;
    }
}

public class TestClass {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++ +" : "+ ++i);
    }
}
