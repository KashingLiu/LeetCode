package com.company.Kashingliu;

public class Q111_0224 {
    public int minDep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minLeft = minDep(root.left);
        int minRight = minDep(root.right);
        if (minLeft == 0 || minRight == 0) {
            return minLeft + minRight + 1;
        } else {
            return Math.min(minLeft, minRight) + 1;
        }

    }
    public int minDepth(TreeNode root) {
        return minDep(root);
    }
}
