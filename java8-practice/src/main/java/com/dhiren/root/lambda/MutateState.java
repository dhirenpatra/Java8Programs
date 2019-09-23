package com.dhiren.root.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutateState {

  private static void stream() {
    List<String> names =
            Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    List<String> result = new ArrayList<>();

    names.stream()
            .filter(name -> name.length() == 4)
            .map(String::toUpperCase)
            .forEach(nameInUpperCase -> result.add(nameInUpperCase));

    System.err.println(result); //[DORY, GILL, NEMO]
  }

  private static void parallelStream() {
    List<String> names =
            Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    List<String> result = new ArrayList<>();

    names.parallelStream()
            .filter(name -> name.length() == 4)
            .map(String::toUpperCase)
            .forEach(nameInUpperCase -> result.add(nameInUpperCase));

    System.err.println(result); //[DORY, GILL, NEMO]
  }

  public static void main(String[] args) {
    stream();
    parallelStream();
  }
}