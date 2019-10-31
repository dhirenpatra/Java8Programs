package com.dhiren.datastructure.stack.using.linkedlist;

public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    // O(1)
    public void push(T newData) {
        size++;
        if(root == null)
            root = new Node<>(newData);
        else {
            Node oldRoot = root;
            root = new Node<>(newData);
            root.setNextNode(oldRoot);
        }
    }

    // O(1)
    public T pop() {
        T itemToPop = root.getData();
        this.root = this.root.getNextNode();
        size--;
        return itemToPop;
    }

    public T peek() {
        return root.getData();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return root == null;
    }

}
