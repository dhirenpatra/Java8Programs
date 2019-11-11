package com.dhiren.datastructure.bst;

public class App {

    public static void main(String[] args) {
        Tree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(10);
        integerTree.insert(9);
        integerTree.insert(11);
        integerTree.insert(12);
        integerTree.insert(13);
        System.out.println("Max value in BST : " +integerTree.maxValue());
        System.out.println("Min value in BST : " +integerTree.minValue());
        integerTree.traverse();
    }

}
