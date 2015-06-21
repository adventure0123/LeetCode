package com.LeetCode;

public class Copy_List_with_Random_Pointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return head;
		}
		RandomListNode node = head;
		while (head != null) {
			RandomListNode rand = new RandomListNode(head.label);
			rand.next = head.next;
			head.next = rand;
			head = rand.next;
		}
		head = node;
		while (head != null) {
			if (head.random != null) {
				RandomListNode rand = head.random.next;
				head.next.random = rand;
			}
			head = head.next.next;
		}
		RandomListNode result = node.next;
		head = node;
		RandomListNode copy = head.next;
		while (head != null) {
			head.next = head.next.next;
			if (copy.next != null) {
				copy.next = copy.next.next;
			} else {
				copy.next = null;
			}
			head = head.next;
			copy = copy.next;

		}
		return result;

	}

	public static void main(String[] args) {
		Copy_List_with_Random_Pointer test = new Copy_List_with_Random_Pointer();
		RandomListNode root = new RandomListNode(-1);
		RandomListNode result = test.copyRandomList(root);
		while (result != null) {
			System.err.println(result.label);
			result = result.next;
		}
	}
}
