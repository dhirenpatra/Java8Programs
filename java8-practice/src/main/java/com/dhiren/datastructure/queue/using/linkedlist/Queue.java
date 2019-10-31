package com.dhiren.datastructure.queue.using.linkedlist;

public class Queue<T extends Comparable> {

    private T data;
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    public Queue() {
        firstNode = null;
        lastNode = null;
        count = 0;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public int size() {
        return count;
    }

    public void enqueue(T data) {
        count++;
        Node previousLast = this.lastNode;
        this.lastNode = new Node(data);
        this.lastNode.setNextNode(null);

        if(isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            previousLast.setNextNode(lastNode);
        }
        System.out.println("Enqueued : "+data);
    }

    public T dequeue() {
        count--;
        T dataToDequeue = null;

        if(!isEmpty()) {
            dataToDequeue = this.firstNode.getData();
            this.firstNode = this.firstNode.getNextNode();
        } else
            this.lastNode = null;
        System.out.println("Dequeue : "+dataToDequeue);
        return dataToDequeue;
    }
}
