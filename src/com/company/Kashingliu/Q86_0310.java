package com.company.Kashingliu;

public class Q86_0310 {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode small_p = small;
        ListNode big = new ListNode();
        ListNode big_p = big;
        while (head != null) {
            if (head.val >= x) {
                big_p.next = new ListNode(head.val);
                big_p = big_p.next;
                big_p.next = null;
            } else {
                small_p.next = new ListNode(head.val);
                small_p = small_p.next;
                small_p.next = null;
            }
            head = head.next;
        }
        small_p.next = big.next;
        small = small.next;
        return small;
    }
}
