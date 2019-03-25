package com.github.yinyinnie.algorithms;

public class MyArrayQueue {

    private final int array[];

    private int head;
    private int tail;
    private final int capacity;

    public MyArrayQueue(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
    }

    public boolean enqueue(int n) {
        if (isFull()) {
            return false;
        }
        if (tail == capacity) {

        }
        array[tail] = n;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }

        head++;
        return true;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail - head) == array.length;
    }

}
