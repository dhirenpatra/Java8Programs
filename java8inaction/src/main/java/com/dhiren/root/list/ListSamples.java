
package com.dhiren.root.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class ListSamples {
    public static void main(String[] args) {
        List<String> stringList = Collections.emptyList();
        //stringList.add("Dhiren");
        System.err.println(stringList);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9,1, 2, 3, 4, 5, 7, 3, 4, 8, 2, 9);

        String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
        List<Integer> integerList = integers.parallelStream().sorted().collect(Collectors.toList());

        List<String> strings = integerList.parallelStream().map(num -> Thread.currentThread().getName()).distinct().collect(Collectors.toList());
        System.err.println(strings.size());
        System.err.println(Runtime.getRuntime().availableProcessors());

//        ForkJoinPool fjp = new ForkJoinPool(2);
//        fjp.submit(() -> {
//            integerList.parallelStream().forEach(num -> System.err.println(Thread.currentThread().getName()));
//        });



        System.err.println("Thread Size"+property);


//        System.out.println(integerList);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//
//        List<String> names = new ArrayList<>();
//        names.add("Dhiren");
//        names.add("Disha");
//        names.add("Dinesh");
//        names.add("Darren");
//        System.out.println(names);
//
//        names.remove("Dinesh");
//        System.out.println(names);
//        names.remove(2);
//        System.out.println(names);

//        List<Person> personList = Arrays.asList(new Person("a", "b", 12),
//                new Person("c", "d", 12),
//                new Person("e", "f", 12));
//
//
//        final Integer age = personList.stream()
//                .filter(person -> person.getFirstName()
//                        .equalsIgnoreCase("a"))
//                .findAny()
//                .map(person -> {
//                    person.setAge(34);
//                    return 34;
//                })
//                .orElse(null);
//
//        System.out.println(age);
//        System.out.println(personList);


		List<String> demo = new LinkedList<>();
		demo.add("Dhiren");
		demo.add("Disha");
		System.out.println(demo);

    }
}
