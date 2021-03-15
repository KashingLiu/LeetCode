package com.company.Kashingliu;

public class Q209_0304 {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            total += nums[i];
            while (total >= target) {
                min = Math.min(min, i - j + 1);
                total -= nums[j++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
