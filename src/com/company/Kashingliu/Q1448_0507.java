package com.company.Kashingliu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//     3
//    4
//   3
//  4
// 1
public class Q1448_0507 {
    int res = 0;
    int max = Integer.MIN_VALUE;
    public void backtrace(TreeNode node) {
        if (node.left == null && node.right == null) {
            if (node.val >= max) {
                res++;
            }
            return;
        }
        int old_max = max;
        if (node.val >= max) {
            res++;
            max = node.val;
        }
        if (node.left != null) {
            backtrace(node.left);
        }
        if (node.right != null) {
            backtrace(node.right);
        }
        max = old_max;
    }
    public int goodNodes(TreeNode root) {
        backtrace(root);
        return res;
    }
}
