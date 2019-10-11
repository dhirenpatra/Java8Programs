package com.dhiren.root.lambda;

import static java.util.Optional.ofNullable;

import java.util.Collections;
import java.util.List;

public class MyLambdaDemo {

    public static void main(String[] args) {
        String name = null;

        List<String> stringList = ofNullable(name)
                .map(names -> Collections.singletonList(names))
                .orElse(Collections.emptyList());

        System.err.println(stringList);
    }

}
