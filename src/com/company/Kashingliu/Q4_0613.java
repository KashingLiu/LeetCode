package com.company.Kashingliu;

import java.util.Arrays;

public class Q4_0613 {
    public double findMedian(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len % 2 == 1) {
            return nums[len / 2];
        } else {
            return (nums[len / 2] + nums[len / 2 - 1]) / 2.0;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        if (nums1.length == 0) {
            res = nums2;
        } else if (nums2.length == 0) {
            res = nums1;
        } else {
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    res[k++] = nums2[j++];
                } else {
                    res[k++] = nums1[i++];
                }
            }
            while (i < nums1.length) {
                res[k++] = nums1[i++];
            }
            while (j < nums2.length) {
                res[k++] = nums2[j++];
            }
        }
        System.out.println(findMedian(res));
        return findMedian(res);
    }
}
