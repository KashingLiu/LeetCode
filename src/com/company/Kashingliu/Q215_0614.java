package com.company.Kashingliu;

import java.util.Arrays;

public class Q215_0614 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
