package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q199_0301 {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new LinkedList<Integer>();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        List<Integer> result = new LinkedList<>();
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size > 0) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                size--;
                if (size == 0) {
                    result.add(current.val);
                }
            }
        }
        return result;
    }
}
