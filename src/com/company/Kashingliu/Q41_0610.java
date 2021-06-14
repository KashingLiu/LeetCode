package com.company.Kashingliu;

import java.util.HashSet;

public class Q41_0610 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            hashSet.add(nums[i]);
        }
        int i = 1;
        for (i = 1; i < nums.length + 1; ++i) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return i + 1;
    }
}
