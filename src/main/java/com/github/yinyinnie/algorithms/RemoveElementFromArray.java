package com.github.yinyinnie.algorithms;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int [] array = new int[]{1, 2, 3, 4, 5, 5, 6};
        int len = removeElement2(array, 5);
        removeElement1(array, 2);


        System.out.println(Arrays.toString(array));

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < len; i++) {
            sb.append(array[i]);
            if (i != len - 1) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());

    }


    // 测试用例有：
    // 1. array is null
    // 2. array is empty
    // 3. array only contains one given element
    // 4. array don't contains given element.
    // 5. array contains two or more given element.

    // 第一种
    static int removeElement1(int[] A, int elem) {
        if (A == null) {
            return 0;
        }
        int l = A.length;
        for (int i = 0; i < l; i++) {
            if (A[i] == elem) {
                A[i] = A[l - 1]; // copy last one to current position.
                i--;
                l--;
            }
        }

        return l;
    }

    // 第二种
    static int removeElement2(int[] A, int elem) {
        if (A == null) {
            return 0;
        }
        int l = A.length;
        for (int i = 0; i < l; i++) {
            if (A[i] == elem) A[i--] = A[l-- -1]; // copy last one to current position.
        }

        return l;
    }
}
