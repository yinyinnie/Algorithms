package com.github.yinyinnie.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class _401_Binary_Watch {


    private static final int []  values = new int[] {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
    private static final BitSet bitSet = new BitSet(10);

    public List<String> readBinaryWatch(int num) {

        List<String> ans = new ArrayList<String>();

        backtracking(num,0, 0, ans);

        return ans;
    }

    private void backtracking(int num, int step, int cur, List<String> ans) {

        if (step  == num) {
            // print result.
            ans.add(getTime());
            return;
        }

        for (int i = cur; i < values.length; i++) {  // num盏等，分为num个阶段，每个阶段放一盏等，检查是否满足条件
            bitSet.set(i);

            if (checkTime()) {
                backtracking(num, step + 1, i + 1, ans);
            }
            bitSet.clear(i);
        }

    }


    private String getTime() {
        int hour = 0;
        int min = 0;
        for (int i = 0; i < values.length; i++) {
            if (i < 4) {
                if (bitSet.get(i)) hour += values[i];
            } else {
                if (bitSet.get(i)) min += values[i];
            }
        }

        return hour + ":" + (min < 10 ? "0" + min : min);
    }

    private boolean checkTime() {
        int hour = 0;
        int min = 0;
        for (int i = 0; i < values.length; i++) {
            if (i < 4) {
                if (bitSet.get(i)) hour += values[i];
            } else {
                if (bitSet.get(i)) min += values[i];
            }
        }

        return hour < 12 && min < 69;
    }

    public static void main(String [] args) {
        _401_Binary_Watch binary_watch = new _401_Binary_Watch();
        List<String> ans = binary_watch.readBinaryWatch(3);
        for (String str : ans) {
            System.out.println(str);
        }

    }
}
