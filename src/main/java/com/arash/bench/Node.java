package com.arash.bench;

public class Node<T> {

    T elem;
    Node<T> prev;

    public Node(T elem, Node<T> prev) {
        this.elem = elem;
        this.prev = prev;
    }

    public T getElem() {
        return elem;
    }

    public Node<T> getPrev() {
        return prev;
    }
}
