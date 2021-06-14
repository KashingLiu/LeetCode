package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;

public class Q257_0302 {
    List<String> answer = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(new StringBuilder(), root);
        return answer;
    }
    public void helper(StringBuilder temp, TreeNode root) {
        if (root.left == null && root.right == null) {
            temp.append("->").append(root.val);
            answer.add(new String(temp));
            temp.delete(0, temp.length() - 1);
            return;
        }
        if (temp.toString().equals("")) {
            temp.append(root.val);
        } else {
            temp.append("->").append(root.val);
        }
        if (root.left != null) {
            helper(temp, root.left);
        }
        if (root.right != null) {
            helper(temp, root.right);
        }
    }
}
