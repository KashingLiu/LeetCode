package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;

public class Q77_0306 {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> temp = new LinkedList<>();
    void backtrace(int[] nums, int k, int index) {
        // index == k?  k == 0?
        if (k == 0) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i = index; i < nums.length; ++i) {
            temp.add(nums[i]);
            backtrace(nums, k - 1, i + 1);
            temp.remove(temp.size() - 1);
        }
        // 为什么要使用for循环？？？
        // 为什么有时候会调用两个backtrace函数？？
        // index的作用是什么？？？
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        backtrace(nums, k, 0);
        System.out.println(result.toString());
        return result;
    }
}
