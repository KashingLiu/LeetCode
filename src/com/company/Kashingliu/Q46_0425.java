package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;

public class Q46_0425 {
    public List<Integer> temp = new LinkedList<>();
    public List<List<Integer>> result = new LinkedList<>();
    public void backtrace(int[] nums, boolean[] visited) {
        if (temp.size() == nums.length) {
            result.add(new LinkedList<>(temp));
        }
        for (int i = 0; i < nums.length; ++i) {
            if (!visited[i]) {
                temp.add(nums[i]);
                visited[i] = true;
                backtrace(nums, visited);
                visited[i] = false;
                temp.remove(temp.size());
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            visited[i] = false;
        }
        backtrace(nums, visited);
        return result;
    }
}
