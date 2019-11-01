package com.dhiren.datastructure.queue.using.stack;

import java.util.Collections;
import java.util.Stack;

public class QueueStack {

    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeStack;

    public QueueStack() {
        this.enqueueStack = new Stack<>();
        this.dequeStack = new Stack<>();
    }

    public void enqueue(int item) {
        this.enqueueStack.push(item);
    }

    public int dequeue() {
        if(enqueueStack.isEmpty() && dequeStack.isEmpty())
            throw new IllegalStateException("Nothing is there to dequeue, queue is empty");
        if(dequeStack.isEmpty()) {
            while(! enqueueStack.isEmpty()) {
                dequeStack.push(enqueueStack.pop());
            }
        }
        return dequeStack.pop();
    }

    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack();
        queueStack.enqueue(10);
        queueStack.enqueue(20);
        queueStack.enqueue(30);
        queueStack.enqueue(40);
        System.out.println("Popped element is : " +queueStack.dequeue());
        System.out.println("Popped element is : " +queueStack.dequeue());
        System.out.println("Popped element is : " +queueStack.dequeue());
        System.out.println("Popped element is : " +queueStack.dequeue());
        queueStack.enqueue(50);
        queueStack.enqueue(60);
        System.out.println("Popped element is : " +queueStack.dequeue());
        System.out.println("Popped element is : " +queueStack.dequeue());
    }

}
