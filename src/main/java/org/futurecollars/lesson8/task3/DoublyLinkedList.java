package org.futurecollars.lesson8.task3;

public class DoublyLinkedList {
    private Node head;
    private int listSize = 0;

    static class Node {
        int value;
        int index;
        Node previous;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public int getListSize() {
        return listSize;
    }

    public void addAtTheEnd(int value) {
        Node newNode = new Node(value);
        Node temporaryHead = head;
        newNode.next = null;

        if (head == null) {
            newNode.previous = null;
            newNode.index = 0;
            head = newNode;
            listSize++;
            return;
        }

        while (temporaryHead.next != null) {
            temporaryHead = temporaryHead.next;
        }
        temporaryHead.next = newNode;
        newNode.previous = temporaryHead;
        newNode.index = temporaryHead.index + 1;

        listSize++;
    }

    public void insertElement(int value, int index) {
        if (index < 0 || listSize <= index) {
            throw new IllegalArgumentException("Such an index does not exist");
        }

        if (index == 0) {
            addAtTheFront(value);
            return;
        }

        Node previousNode = head;
        while (previousNode.next.index != index) {
            previousNode = previousNode.next;
        }

        Node newNode = new Node(value);
        newNode.index = index;
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        newNode.previous = previousNode;
        newNode.next.previous = newNode;

        Node temporaryNode = newNode;
        while (temporaryNode.next != null) {
            temporaryNode = temporaryNode.next;
            temporaryNode.index++;
        }

        listSize++;
    }

    public void addAtTheFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.index = 0;
        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;

        Node temporaryHead = head;
        while (temporaryHead.next != null) {
            temporaryHead = temporaryHead.next;
            temporaryHead.index++;
        }

        listSize++;
    }

    public void removeElement(int index) {
        if (index < 0 || listSize <= index) {
            throw new IllegalArgumentException("Such an index does not exist");
        }

        Node nodeToBeDeleted = head;
        while (nodeToBeDeleted.index != index) {
            nodeToBeDeleted = nodeToBeDeleted.next;
        }

        if (head == nodeToBeDeleted) {
            head = nodeToBeDeleted.next;
        }

        if (nodeToBeDeleted.next != null) {
            nodeToBeDeleted.next.previous = nodeToBeDeleted.previous;
        }

        if (nodeToBeDeleted.previous != null) {
            nodeToBeDeleted.previous.next = nodeToBeDeleted.next;
        }

        Node temporaryHead = nodeToBeDeleted;
        while (temporaryHead.next != null) {
            temporaryHead = temporaryHead.next;
            temporaryHead.index--;
        }

        listSize--;
    }
}