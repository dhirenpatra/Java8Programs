package com.dhiren.root.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListSamples {
    public static void main(String[] args) {
        List<String> stringList = Collections.emptyList();
        //stringList.add("Dhiren");
        System.err.println(stringList);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9);
        List<Integer> integerList = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);
    }
}
