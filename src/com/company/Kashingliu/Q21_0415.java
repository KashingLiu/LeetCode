package com.company.Kashingliu;

public class Q21_0415 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null || l2 == null) {
            return l2 == null ? l1 : l2;
        }
        ListNode result;
        ListNode p = l1;
        ListNode q = l2;
        ListNode r;
        if (p.val <= q.val) {
            result = p;
            p = p.next;
        } else {
            result = q;
            q = q.next;
        }
        ListNode current = result;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                r = p.next;
                current.next = p;
                p = r;
            } else {
                r = q.next;
                current.next = q;
                q = r;
            }
            current = current.next;
        }
        current.next = p != null ? p : q;
        return result;
    }
}
