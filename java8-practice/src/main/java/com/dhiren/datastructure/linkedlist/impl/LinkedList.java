package com.dhiren.datastructure.linkedlist.impl;

import com.dhiren.datastructure.linkedlist.helper.Node;

public class LinkedList<T extends Comparable> implements List<T> {

    private int size = 0;
    private Node<T> head;

    @Override
    public void insert(T data) {
        size++;
        if(head == null)
            head = new Node(data);
        else
            insertAtBeginning(data);
    }

    private void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNode(head);
        head = newNode;
    }

    public void insertAtEndingRecurssive(T data, Node node) {
        System.out.println("Inserting at the end");
        size++;
       if(node.getNode() != null) {
           insertAtEndingRecurssive(data, node.getNode());
       } else {
           Node newNode = new Node(data);
           node.setNode(newNode);
       }
    }

    public void insertAtEnding(T data) {
        size++;
        Node currentNode = head;
        while(currentNode.getNode() != null) {
            if(currentNode.getNode() == null) {
                Node newNode = new Node(data);
                currentNode.setNode(newNode);
                return;
            }
            currentNode = currentNode.getNode();
        }
    }

    @Override
    public void remove(T data) {
        if(head == null)
            throw new IllegalStateException("No values present to delete");
        Node currentNode = head;
        while(currentNode.getNode() != null) {
            if(currentNode.getData().compareTo(data) == 0) {
                currentNode.setNode(currentNode.getNode().getNode());
            }
            currentNode = currentNode.getNode();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public void reverse() {

    }
}
