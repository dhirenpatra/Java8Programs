package com.dhiren.root.optional;

import java.util.Optional;

public class OptionalOfNullableAndOf {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        String stringOne = "Yes";
        String stringTwo = null;

        System.out.println("Optional.ofNullable of gender ===> " + gender);
        System.out.println("Value of gender ===> " + gender.get());
        System.out.println("Optional.ofNullable of stringOne ===> " + Optional.ofNullable(stringOne));
        System.out.println("Optional.ofNullable of stringTwo ===> " + Optional.ofNullable(stringTwo));

        System.out.println("Optional.of() of gender ===> " + gender);
        System.out.println("Optional.of() of stringOne ===> " + Optional.of(stringOne));

        // NPE -- in below line as stringTwo is null
        // System.out.println("Optional.of() of stringTwo ===> " + Optional.of(stringTwo));

    }

}
