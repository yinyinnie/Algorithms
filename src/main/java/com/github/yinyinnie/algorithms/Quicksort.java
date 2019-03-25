package com.github.yinyinnie.algorithms;

public class Quicksort {

    public int [] qsort1(int a[]) {
        int len = a != null ? a.length : 0;

        if (len < 2) {
            return a;
        }

        sort(a, 0, len - 1);

        return a;
    }

    /**
     *
     * @return m index of pivot.
     */
    public int partition(int a[], int l, int u) {
        int m = l;

        // select a[l] as the pivot.
        for (int i = l + 1; i <= u; i++) {
            if (a[i] < a[l]) { // 将小于pivot的数，换到前面
                ++m;
                int temp = a[m];
                a[m] = a[i];
                a[i] = temp;
            }
        }
        // 将pivot放到正确的位置
        int temp = a[m];
        a[m] = a[l];
        a[l] = temp;

        return m;
    }

    void sort(int a[], int l, int u) {
        if (l >= u) {
            return;
        }

        int pivotIndex = partition(a, l, u);
        sort(a, l, pivotIndex - 1);
        sort(a, pivotIndex + 1, u);
    }

    public static void main(String [] args) {
        Quicksort quicksort = new Quicksort();

        int a[] = quicksort.qsort1(new int[] {2,1});
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

}
