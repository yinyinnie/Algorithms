package com.github.yinyinnie.algorithms.queue;

/**
 * just for leetcode, so the method's name looks not good.
 * @see <a href="https://leetcode.com/problems/design-circular-queue"></a>
 */
public class MyCircularQueue {
    private final int [] array;
    private int head;
    private int rear;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be > 0");
        }
        array = new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (rear == array.length
                && head != 0) {
            rear = 0;
        }
        array[rear++] = value;

        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {

        if (isEmpty()) {
            return false;
        }

        head++;

        // reset head
        if (head == array.length) {
            head = 0;
        }
        size--;

        if (isEmpty()) {
            head = rear = 0;
        }
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            throw new NullPointerException("queue be empty");
        }
        return array[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            throw new NullPointerException("queue be empty");
        }
        return array[rear -1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == array.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "this queue is empty.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public static void main(String [] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        System.out.println(circularQueue.toString());
        circularQueue.deQueue();
        circularQueue.enQueue(4);

     }
}