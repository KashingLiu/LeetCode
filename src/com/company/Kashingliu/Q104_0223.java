package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.Queue;

public class Q104_0223 {
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(helper(root.left), helper(root.right)) + 1;
        }
    }
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
    public int helper2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                queue.poll();

                size--;
            }
        }
        return 1;
    }
}
