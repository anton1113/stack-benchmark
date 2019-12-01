package com.arash.bench;

public class LinkedStack<T> implements Stack<T> {

    private Node<T> top;

    public void push(T elem) {
        if (isEmpty()) {
            top = new Node<T>(elem, null);
        } else {
            top = new Node<T>(elem, top);
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T result = top.getElem();
            top = top.getPrev();
            return result;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
