package com.dhiren.datastructure.stack.using.linkedlist;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(100);
        integerStack.push(1000);

        System.err.println("Size : " +integerStack.size());
        System.err.println("Empty Stack : " +integerStack.isEmpty());

        System.out.println("Popped : "+integerStack.pop());
        System.out.println("Popped : "+integerStack.pop());
        System.out.println("Popped : "+integerStack.pop());

        System.err.println("Size : " +integerStack.size());
        System.err.println("Empty Stack : " +integerStack.isEmpty());
    }

}
