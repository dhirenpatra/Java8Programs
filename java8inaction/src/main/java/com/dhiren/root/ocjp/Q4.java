package com.dhiren.root.ocjp;

public class Q4 {

    static int i =10;
    int j = 20;
    public void m1()
    {
        i++;
        j++;
    }
    public static void main(String[] args)
    {
        Q4 t1 = new Q4();
        t1.m1();

        Q4 t2 = new Q4();
        t2.m1();

        System.out.print(t2.i+" "+t2.j);
    }
}
