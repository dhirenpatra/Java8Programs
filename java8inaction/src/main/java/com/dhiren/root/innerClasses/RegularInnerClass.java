package com.dhiren.root.innerClasses;

public class RegularInnerClass {

    int x = 10;
    static int y = 111;

    private class Inner {

        int x = 100;

        public void m1() {
            int x = 1000;
            System.out.println(x + " local x");
            System.out.println(y + " outer class static variable y");
            System.out.println(RegularInnerClass.y + " outer class static variable y");
            System.out.println(this.x + " instance variable x");
            System.out.println(Inner.this.x + " instance variable x");
            System.out.println(RegularInnerClass.this.x + " outer class instance variable x");
        }
    }

    public static void main(String[] args) {
        new RegularInnerClass().new Inner().m1();
    }

}
