package com.dhiren.root.generics.pluralsight.driver;

import com.dhiren.root.generics.pluralsight.generics.MyGenericClass;

public class GenericDriver {

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,5,4,6,8,7};
        String[] strArray = {"Dhiren", "Disha" };

        MyGenericClass<Integer> integerClass = new MyGenericClass<>(intArray);
        integerClass.printElementOneByOne(intArray);
        integerClass.printElements(intArray);


        MyGenericClass<String> stringClass = new MyGenericClass<>(strArray);
        stringClass.printElementOneByOne(strArray);
        stringClass.printElements(strArray);
    }

}
