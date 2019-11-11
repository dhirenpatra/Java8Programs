package com.dhiren.datastructure.bst;

public class BinarySearchTree<T extends Comparable> implements Tree<T> {

    private Node<T> rootNode;

    @Override
    public void insert(T data) {
        if(rootNode == null)
            rootNode = new Node<>(data);
        else
            insertNode(data, rootNode);
    }

    @Override
    public T minValue() {
        return (rootNode == null) ? null : getMinValue(rootNode);
    }

    @Override
    public T maxValue() {
        return (rootNode == null) ? null : getMaxValue(rootNode);
    }

    public void insertNode(T newData, Node node) {
        if(newData.compareTo(node.getData()) < 0) {
            if(node.getLeftChild() != null)
                insertNode(newData, node.getLeftChild());
            else
                node.setLeftChild(new Node(newData));

        } else {
            if(node.getRightChild() != null)
                insertNode(newData, node.getRightChild());
            else
                node.setRightChild(new Node(newData));
        }
    }

    public T getMinValue(Node node) {
        if(node.getLeftChild() != null)
            return getMinValue(node.getLeftChild());
        return (T) node.getData();
    }

    public T getMaxValue(Node node) {
        Node currentNode = node;
        while(currentNode.getRightChild() != null) {
            currentNode = currentNode.getRightChild();
        }
        return (T) currentNode.getData();
    }

    @Override
    public void traverse() {
        if(rootNode != null)
            inOrderTraversal(rootNode);
    }

    @Override
    public T delete(Node node) {
        return null;
    }

    private void inOrderTraversal(Node<T> rootNode) {
        if(rootNode.getLeftChild() != null)
            inOrderTraversal(rootNode.getLeftChild());

        System.out.print(rootNode);

        if(rootNode.getRightChild() != null)
            inOrderTraversal(rootNode.getRightChild());

    }




}
