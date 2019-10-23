package com.dhiren.root.miscelenous;

import java.util.Arrays;

class MyFinalClass {
    String name;
    String age;

    public MyFinalClass() {
    }

    public MyFinalClass(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyFinalClass{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
public class FinalKeywordDemo {

    public static void main(String[] args) {
        final MyFinalClass myFinalClass = new MyFinalClass("dhiren" , "23");
        System.out.println(myFinalClass);
        myFinalClass.setAge("24");
        myFinalClass.setName("Dhiren");
        System.out.println(myFinalClass);

        final Integer[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        array[1] = 99;
        System.out.println(Arrays.toString(array));

        // the below is incorrect
        //array = new Integer[]{1, 2, 3, 4, 5};
    }

}
