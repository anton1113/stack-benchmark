package com.arash.bench;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {

    private static final int INITIAL_SIZE = 16;
    private static final int EXTENSION_MULTIPLIER = 2;

    private T[] values = (T[]) new Object[INITIAL_SIZE];
    private int topIndex = -1;

    public void push(T elem) {
        if (topIndex == values.length - 1) {
            values = Arrays.copyOf(values, values.length * EXTENSION_MULTIPLIER);
        }
        values[++topIndex] = elem;
    }

    public T pop() {
        return values[topIndex--];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
