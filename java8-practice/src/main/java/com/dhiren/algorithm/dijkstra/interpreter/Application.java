package com.dhiren.algorithm.dijkstra.interpreter;

public class Application {

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        algorithm.interpretExpression("( ( 2 + 3 ) * ( 5 * 6 ) )");
        System.out.println(algorithm.result());
    }
}
