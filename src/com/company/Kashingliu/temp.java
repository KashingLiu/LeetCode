package com.company.Kashingliu;

import java.util.Stack;

public class temp {
    public void flatten(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty() && root != null) {
            TreeNode current = stack.pop();
            System.out.println(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
}
