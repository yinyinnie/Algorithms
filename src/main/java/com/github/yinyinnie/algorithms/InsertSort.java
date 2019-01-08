package com.github.yinyinnie.algorithms;

public class InsertSort {

    /**
     * at beginning, write code like this.
     * @param a
     * @return
     */
    public int [] insertSort1(int a[]) {

        int len = a != null ? a.length : 0;

        if (len < 2) {
            return a;
        }

        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j-1]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                } else {
                    break;
                }
            }
        }


        return a;
    }

    /**
     * optimize with sentinel
     * @param a unsorted array
     * @return a sorted array
     */
    public int [] insertSort2(int a[]) {
        int len = a != null ? a.length : 0;

        if (len < 2) {
            return a;
        }

        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }

        return a;
    }

    /**
     * optimize
     * @param a unsorted array
     * @return a sorted array
     */
    public int [] insertSort3(int a[]) {
        int len = a != null ? a.length : 0;

        if (len < 2) {
            return a;
        }

        for (int i = 1; i < len; i++) {
            int temp = a[i];

            int j = i;
            for (; j > 0 && temp < a[j-1]; j--)
                a[j] = a[j-1];

            a[j] = temp;
        }

        return a;
    }
}
