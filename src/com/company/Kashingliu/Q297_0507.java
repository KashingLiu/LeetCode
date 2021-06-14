package com.company.Kashingliu;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q297_0507 {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder res = new StringBuilder();
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.addLast(root);
            while (!queue.isEmpty()) {
                TreeNode current = queue.removeLast();
                res.append(root.val);
                if (current.left != null) {
                    queue.addLast(current.left);
                }
                if (current.right != null) {
                    queue.addLast(current.right);
                }
            }
            System.out.println(res.toString());
            return res.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            TreeNode res = new TreeNode();
            return res;
        }
    }
}
