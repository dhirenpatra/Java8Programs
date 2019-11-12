package com.dhiren.root.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyV3 {

  public static int factor = 2;

  public static List<Integer> transform(List<Integer> numbers) {
    return numbers.stream()
                  .map(e -> e * factor).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    List<Integer> stream = transform(numbers);

    factor = 0;
    System.out.println(stream);
  }
}