package com.LeetCode;

public class Partition_List {
	public ListNode partition(ListNode head, int x) {
		ListNode less = new ListNode(-1);
		ListNode node1 = less;
		ListNode more = new ListNode(0);
		ListNode node2 = more;
		if (head == null) {
			return head;
		}
		while (head != null) {
			if (head.val < x) {
				node1.next = head;
				node1 = node1.next;
			} else {
				node2.next = head;
				node2 = node2.next;
			}
			head = head.next;
		}
		node2.next = null;
		node1.next = more.next;
		return less.next;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(1);
		node.next = new ListNode(4);
		node.next.next = new ListNode(3);
		Partition_List testList = new Partition_List();
		ListNode resul = testList.partition(node, 4);
		while (resul != null) {
			System.out.println(resul.val);
			resul = resul.next;
		}
	}

}
