package com.dhiren.interviews;

import com.dhiren.root.lambda.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoldMan {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 4);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 9));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(8, 7, 6));


        List<Person> list4 = new ArrayList<>(Arrays.asList(
                new Person("a", "s",12),
                new Person("a", "s",10),
                new Person("a", "s",14)
        ));

        final List<String> namesList = list4.stream().filter(person -> person.getAge() > 10)
                .map(Person::getFirstName)
                .collect(Collectors.toList());

        System.err.println(namesList);

        List<List<Integer>> listOfList = Arrays.asList(list1, list2, list3);
        int m = listOfList.size();
        int n = listOfList.get(0).size();

        System.out.println(m);
        System.out.println(n);

        final List<Integer> collect =
                listOfList.stream().flatMap(entry -> entry.stream()).collect(Collectors.toList());

        collect.stream().distinct().collect(Collectors.toList());

        System.out.println(listOfList);
        System.out.println(collect);

        final List<List<Integer>> collect1 =
                listOfList.stream().map(entry -> entry.stream().sorted().collect(Collectors.toList())).collect(Collectors.toList());

        System.out.println(collect1);

        int count = 0;

        for (int i = 0; i < listOfList.size(); i++) {
            for (int j = 0; j < listOfList.get(0).size(); j++) {
                List<Integer> lists = new ArrayList<>();
                int start = 0;
                while(start < collect.size() ) {
                    lists.add(collect.get(start));
                    start = start + n;
                }
                int num = listOfList.get(i).get(j);
                listOfList.get(i).sort(Comparator.naturalOrder());

                System.out.println(listOfList.get(i) + "After sort");

                if (num == listOfList.get(i).get(0)) {
                    count = count + 1;
                    System.out.println(num);
                }
                if (num == listOfList.get(i).get(m-1)) {
                    count = count + 1;
                    System.out.println(num);
                }

                if (num == lists.get(n-1)) {
                    count = count + 1;
                    System.out.println(num);
                }
            }
        }
        System.out.println(count+ "counter");
    }

}
