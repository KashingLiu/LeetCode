package com.company.Kashingliu;

public class Q124_0425 {
    int max = Integer.MIN_VALUE;
    public int backtrace(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(backtrace(root.left), 0);
        int right = Math.max(backtrace(root.right), 0);
        // 计算最大值的时候是用的自己左右节点最大值加上自己节点的和，和当前最大值比较
        max = Math.max(max, left + right + root.val);
        // 然而返回给上一层节点的时候，返回的是左右两个节点中最大的那一个和当前节点的和
        return Math.max(left, right) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        backtrace(root);
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
