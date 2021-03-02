package com.company.Kashingliu;

public class Q109_0302 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        return format(head, null);
    }
    public TreeNode format(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMid(left, right);
        TreeNode node = new TreeNode(mid.val);
        node.left = format(left, mid);
        node.right = format(mid.next, right);
        return node;
    }
    public ListNode getMid(ListNode left, ListNode right) {
        ListNode slow = left;
        ListNode fast = left;
        while (fast != right && fast.next != right) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
