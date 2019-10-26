package com.dhiren.datastructure.linkedlist.impl;

import com.dhiren.datastructure.linkedlist.helper.Node;

public class LinkedListV2<T extends Comparable> implements List<T> {

    private int size;
    private Node head;
    private Node tail;

    public LinkedListV2() {
        head = null;
        tail = null;
        size = 0;
    }

    private int incrementSize() {
        return size++;
    }

    private int decrementSize() {
        return size--;
    }

    @Override
    public void insert(T data) {
        incrementSize();
        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node newNode = new Node(data);
            tail.setNode(newNode);
            tail = newNode;
        }
    }

    public void insertAt(T data, int position) {
        if(position > size()) {
            throw new IllegalStateException("Invalid position entered, list size is below the position entered");
        }
        Node currentNode = head;
        for(int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNode();
        }
        Node newNode = new Node(data);
        Node nextNode = currentNode.getNode();
        newNode.setNode(nextNode);
        currentNode.setNode(newNode);
        incrementSize();
    }

    public T removeAt(int position) {
        if(position > size()) {
            throw new IllegalStateException("Invalid position entered, list size is below the position entered");
        }
        Node currentNode = head;
        Node previousNode = head;
        for(int i = 1; i < position && currentNode != null; i++) {
            previousNode = currentNode;
            currentNode = currentNode.getNode();
        }

        T data = (T) currentNode.getData();
        previousNode.setNode(currentNode.getNode());
        decrementSize();
        return data;
    }

    public void print() {
        Node currentNode = head;
        System.out.println("------");
        while (currentNode.getNode() != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNode();
            System.out.println("------");
            if(currentNode.getNode() == null) {
                System.out.println(currentNode.getData());
                System.out.println("------");
            }

        }
    }

    public T remove() {
        if(head == null)
            throw new IllegalStateException("Nothing to remove");
        T tobeDeleted = (T) head.getData();
        decrementSize();
        head = head.getNode();
        return tobeDeleted;
    }

    @Override
    public void remove(T data) {
        Node currentNode = head;
        Node previousNode = head;
        Node previousToPreviousNode = head;
        while(currentNode != null) {
            if(currentNode.getData().compareTo(data) == 0) {
                previousToPreviousNode = previousNode;
                previousNode = currentNode;
                System.out.println("Previous : " +previousNode.getData());
                currentNode = currentNode.getNode();
                System.out.println("Current : " +currentNode.getData());
                break;
            }
            currentNode = currentNode.getNode();
        }
        if(previousNode.equals(head)) {
            System.out.println("Not Found");
        } else {
            previousToPreviousNode.setNode(currentNode);
            decrementSize();
            System.out.println("Removed");
        }
    }

    public T get(int position) {
        if(position > size()) {
            throw new IllegalStateException("Invalid position entered, list size is below the position entered");
        }
        Node currentNode = head;
        for(int i = 0; i < size() && currentNode != null; i++) {
            if(i == position) {
                return (T) currentNode.getData();
            }
            currentNode = currentNode.getNode();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head.setNode(null);
        size = 0;
    }
}
