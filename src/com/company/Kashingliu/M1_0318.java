package com.company.Kashingliu;

// 求一个数组的最长连续相同子数组
// 1，2，2，2，2，1，1     最长连续4个2，返回4

public class M1_0318 {
    public int function (int[] nums) {
        int res = 0;
        int temp = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                temp++;
            } else {
                res = Math.max(temp, res);
                temp = 1;
            }
        }
        res = Math.max(temp, res);
        System.out.println(res);
        return res;
    }
}
