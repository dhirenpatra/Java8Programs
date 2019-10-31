package com.dhiren.datastructure.stack.using.linkedlist;

public class Node<T extends Comparable> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        nextNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
