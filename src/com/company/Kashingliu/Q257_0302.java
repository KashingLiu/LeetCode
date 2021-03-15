package com.company.Kashingliu;

import java.util.LinkedList;
import java.util.List;

public class Q257_0302 {
    List<String> answer = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(new StringBuilder(), root);
        return answer;
    }
    public void helper(StringBuilder temp, TreeNode node) {
        if (node == null) {
            answer.add(temp.toString());
            temp = new StringBuilder();
        }
        temp.append("->"+node.val);
        helper(temp, node.left);
        helper(temp, node.right);
    }
}
