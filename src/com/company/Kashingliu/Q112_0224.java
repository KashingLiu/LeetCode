package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.Queue;

public class Q112_0224 {
    private boolean path(TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return targetSum == node.val;
        }
        return path(node.left, targetSum-node.val) || path(node.right, targetSum - node.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean flag = false;
        System.out.println(path(root, 12));
        return flag;
    }
    public boolean hasPath(TreeNode node, int targetSum) {
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> digits = new LinkedList<>();
        boolean flag = false;
        nodes.offer(node);
        digits.offer(node.val);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            while (size > 0) {
                TreeNode temp = nodes.poll();
                int current = digits.poll();
                if (temp.left != null) {
                    nodes.offer(temp.left);
                    digits.offer(temp.left.val + current);
                }
                if (temp.right != null) {
                    nodes.offer(temp.right);
                    digits.offer(temp.right.val + current);
                }
                if (temp.left == null && temp.right == null && temp.val + current == targetSum) {
                    flag = true;
                }
                size--;
            }
        }
        return flag;
    }
}
