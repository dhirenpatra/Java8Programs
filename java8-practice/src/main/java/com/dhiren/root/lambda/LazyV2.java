package com.dhiren.root.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyV2 {

  public static int factor = 2;

  public static Stream<Integer> transform(List<Integer> numbers) {
    return numbers.stream()
                  .map(e -> e * factor)
                  .filter(e -> e > 5);
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    Stream<Integer> stream = transform(numbers);
    //System.out.println(stream.collect(Collectors.toList()));
    factor = 0;
    System.out.println(stream.collect(Collectors.toList()));
  }
}