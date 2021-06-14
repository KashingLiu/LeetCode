package com.company.Kashingliu;

import java.util.*;

public class Q103_0420 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<List<Integer>>();
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> temp = new ArrayDeque<>();
            while (size > 0) {
                TreeNode current = queue.poll();
                if (flag) {
                    temp.addFirst(current.val);
                } else {
                    temp.addLast(current.val);
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                size--;
            }
            flag = !flag;
            result.add(new LinkedList<>(temp));
        }
        return result;
    }
}
