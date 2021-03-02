package com.company.Kashingliu;

import java.util.Queue;
import java.util.Stack;

public class Q114_0302 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (prev != null) {
                prev.left = null;
                prev.right = current;
            }
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
            prev = current;
        }
        return;
    }
}
