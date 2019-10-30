package com.dhiren.datastructure.stack.using.array;

public class StackUsingArrays {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Stack Empty : " + integerStack.isEmpty());
        System.out.println("Stack Size : " + integerStack.size());
        System.out.println("Stack Capacity : " + integerStack.capacity());
        integerStack.push(1);
        integerStack.push(2);
        System.out.println("Stack Size : " + integerStack.size());
        System.out.println("Stack Capacity : " + integerStack.capacity());
        integerStack.push(3);
        integerStack.push(3);
        integerStack.push(3);
        System.out.println("Stack Size : " + integerStack.size());
        System.out.println("Stack Capacity : " + integerStack.capacity());
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
        System.out.println("Stack Size : " + integerStack.size());
        System.out.println("Stack Capacity : " + integerStack.capacity());
        integerStack.pop();
        integerStack.pop();
        System.out.println("Stack Size : " + integerStack.size());
        System.out.println("Stack Capacity : " + integerStack.capacity());
        System.out.println("Stack Empty : " + integerStack.isEmpty());
        System.out.println(integerStack);
    }

}
