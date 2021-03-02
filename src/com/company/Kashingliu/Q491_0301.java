package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;

public class Q491_0301 {
    private List<Integer> temp = new LinkedList<>();
    private List<List<Integer>> answer = new LinkedList<>();
    private void backtrace(int[] nums, int index, int last) {
        if (index == nums.length) {
            if (temp.size() >= 2) {
                answer.add(new LinkedList<>(temp));
            }
            return;
        }
        if (nums[index] >= last) {
            temp.add(nums[index]);
            backtrace(nums, index + 1, nums[index]);
            temp.remove(temp.size() - 1); // 这里不是remove那个值，而是根据nums的index来删掉temp的最后一个元素
        }
        if (nums[index] != last) {
            backtrace(nums, index + 1, last);
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtrace(nums, 0, Integer.MIN_VALUE);
        return answer;
    }
}