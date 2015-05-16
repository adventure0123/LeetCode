package com.LeetCode;

// linked list
public class Add_Two_Numbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode resul = new ListNode(-1);
		ListNode node = resul;
		int carry_bit = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry_bit;
			carry_bit = sum / 10;
			int value = sum % 10;
			l1.val = value;
			node.next = l1;
			l1 = l1.next;
			l2 = l2.next;
			node = node.next;
		}
		if (l1 != null) {
			if (carry_bit != 0) {
				copyNode(node, carry_bit);
				carry_bit = 0;
			}
		}
		if (l2 != null) {
			node.next = l2;
			if (carry_bit != 0) {
				copyNode(node, carry_bit);
				carry_bit = 0;
			}
		}
		if (carry_bit != 0) {
			node.next = new ListNode(carry_bit);
		}
		return resul.next;

	}

	private void copyNode(ListNode node, int carry_bit) {
		while (node.next != null && carry_bit != 0) {
			int sum = carry_bit + node.next.val;
			int value = sum % 10;
			carry_bit = sum / 10;
			node.next.val = value;
			node = node.next;
		}
		if (carry_bit != 0) {
			node.next = new ListNode(carry_bit);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		ListNode l2 = new ListNode(1);
		Add_Two_Numbers test = new Add_Two_Numbers();
		ListNode result = test.addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

}
