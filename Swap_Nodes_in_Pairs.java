package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/5/20.
 */
public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(-1);
        ListNode node = result;
        ListNode temp = new ListNode(0);
        while (head != null && head.next != null) {
            temp = head.next.next;
            node.next = head.next;
            head.next.next = head;
            node = head;
            head.next = temp;
            head = temp;
        }
        return result.next;
    }

    public static void main(String[] args) {

    }
}
