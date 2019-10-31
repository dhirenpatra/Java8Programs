package com.dhiren.algorithm.dijkstra.interpreter;

import java.util.Stack;

public class Algorithm {

    private Stack<String> operationStack;
    private Stack<Double> valueStack;

    public Algorithm() {
        operationStack = new Stack<>();
        valueStack = new Stack<>();
    }

    public void interpretExpression(String expression) {
        String[] expressionArray = expression.trim().split(" ");
        for(String string : expressionArray ) {
            if(string.equals("(")) {
                // do nothing
            } else if(string.equals("+")) {
                operationStack.push(string);
            } else if(string.equals("*")) {
                operationStack.push(string);
            } else if(string.equals("-")) {
                operationStack.push(string);
            } else if(string.equals("/")) {
                operationStack.push(string);
            } else if(string.equals(")")) {
                String operation = operationStack.pop();
                if(operation.equals("+")) {
                    valueStack.push(valueStack.pop() + valueStack.pop());
                } else if(operation.equals("-")) {
                    valueStack.push(valueStack.pop() - valueStack.pop());
                } else if(operation.equals("*")) {
                    valueStack.push(valueStack.pop() * valueStack.pop());
                } else if(operation.equals("/")) {
                    valueStack.push(valueStack.pop() / valueStack.pop());
                }
            } else {
                valueStack.push(Double.valueOf(string));
            }
        }
    }

    public Double result() {
        return valueStack.pop();
    }
}
