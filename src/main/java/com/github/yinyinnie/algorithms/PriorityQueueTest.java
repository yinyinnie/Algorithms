package com.github.yinyinnie.algorithms;

import java.util.*;

public class PriorityQueueTest {

    public static void main(String [] args) {

        Integer [] array = new Integer[] {9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(6, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        pq.addAll(Arrays.asList(array));

        System.out.println(pq.toString());

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + ", ");
        }
    }
}
