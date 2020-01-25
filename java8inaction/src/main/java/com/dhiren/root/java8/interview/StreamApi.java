package com.dhiren.root.java8.interview;

import com.dhiren.io.serialization.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        employeeGroups(employees);
        groupingByAge(employees);
        groupByAgeAndCount(employees);
        groupByAgeAndMapByNames(employees);
        getAllEmployeesByName(employees);
    }

    private static void getAllEmployeesByName(List<Employee> employees) {
        final String joiningAllEmployees = employees.stream().map(employee -> employee.getName())
                .collect(Collectors.joining(","));
        System.out.println(joiningAllEmployees);
    }

    private static void groupByAgeAndMapByNames(List<Employee> employees) {
        Map<Integer, List<String>> collect = employees.stream().collect(
                Collectors.groupingBy(employee -> employee.getAge(),
                        Collectors.mapping(employee -> employee.getName(), Collectors.toList())));
        System.out.println(collect);
    }

    private static void groupByAgeAndCount(List<Employee> employees) {
        final Map<Integer, Long> groupByAgeAndCounting = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge(),
                        Collectors.counting()));
        System.out.println(groupByAgeAndCounting);
    }

    private static void groupingByAge(List<Employee> employees) {
        final Map<Integer, List<Employee>> groupByAge = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge()));
        System.out.println(groupByAge);
    }

    private static void employeeGroups(List<Employee> employees) {
        final Map<Boolean, List<Employee>> employeeGroups = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge() >= 25));
        System.out.println(employeeGroups);
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("A", 23), new Employee("B", 24),
                new Employee("C", 25), new Employee("CC", 25),
                new Employee("CCC", 25), new Employee("D", 26),
                new Employee("E", 27)
        );
    }
}
