package com.LeetCode;

public class Intersection_of_Two_Linked_Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode node1 = headA;
		ListNode node2 = headB;
		if (node1 == null || node2 == null) {
			return null;
		}
		int length1 = 1;
		while (node1.next != null) {
			node1 = node1.next;
			length1++;
		}
		int length2 = 1;
		while (node2.next != null) {
			node2 = node2.next;
			length2++;
		}
		if (node1 != node2) {
			return null;
		}
		node1 = headA;
		node2 = headB;
		if (length1 < length2) {

			for (; length2 > length1; length2--) {
				node2 = node2.next;
			}
		}
		if (length1 > length2) {
			for (; length1 > length2; length1--) {
				node1 = node1.next;
			}
		}
		while (node1 != node2) {
			node1 = node1.next;
			node2 = node2.next;
		}
		return node1;

	}
}
