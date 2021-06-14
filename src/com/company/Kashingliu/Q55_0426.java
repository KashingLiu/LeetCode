package com.company.Kashingliu;

public class Q55_0426 {
    public boolean canJump(int[] nums) {
        int max_len = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= max_len) {
                max_len = Math.max(max_len, i + nums[i]);
                if (max_len >= nums.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
