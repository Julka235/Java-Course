package org.futurecollars.lesson9.task2;

public class IntegerQueue implements OwnQueue {
    private Node head;

    private static class Node {
        Integer value;
        Node next;

        Node(Integer value) {
            this.value = value;
        }
    }

    @Override
    public Integer element() {
        if (head == null) return null;
        return head.value;
    }

    @Override
    public boolean add(Integer e) {
        Node newNode = new Node(e);
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return true;
        }

        Node temporaryHead = head;
        while (temporaryHead.next != null) {
            temporaryHead = temporaryHead.next;
        }
        temporaryHead.next = newNode;

        return true;
    }

    @Override
    public Integer remove() {
        if (head == null) return null;

        Integer element = head.value;
        head = head.next;

        return element;
    }
}
