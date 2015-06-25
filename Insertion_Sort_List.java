package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/25.
 */
public class Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(Integer.MIN_VALUE);
        result.next = head;
        ListNode pre = head;
        head = head.next;
        while (head != null) {
            if (head.val >= pre.val) {
                head = head.next;
                pre = pre.next;
            } else {
                ListNode node = result;
                pre.next = head.next;
                while (!(head.val >= node.val && head.val <= node.next.val)) {
                    node = node.next;
                }
                head.next = node.next;
                node.next = head;
                head = pre.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        Insertion_Sort_List test = new Insertion_Sort_List();
        ListNode root = new ListNode(3);
        ListNode node1 = new ListNode(2);
        root.next = node1;
        node1.next = new ListNode(1);
        ListNode result = test.insertionSortList(root);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
