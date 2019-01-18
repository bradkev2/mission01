package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.List;

public class SinglyLinkedList<E> implements List<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public E first() {
        if (head == null)
            return null;
        return head.getData();
    }

    @Override
    public E last() {
        if (tail == null)
            return null;
        return tail.getData();
    }

    @Override
    public void addLast(E element) {
        if (element == null)
            return;

        Node<E> newest = new Node<>(element);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    @Override
    public void addFirst(E element) {

    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public void insert(E element, int index) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void printList() {

    }
}
