

// two pointer
public class Remove_Nth_Node_From_End_of_List {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fastNode = head;
		while (n > 0) {
			fastNode = fastNode.next;
			n--;
		}
		if (fastNode == null) {
			return head.next;
		}
		ListNode slowNode = head;
		while (fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next;
		}
		slowNode.next = slowNode.next.next;
		return head;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Nth_Node_From_End_of_List test = new Remove_Nth_Node_From_End_of_List();
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		ListNode result = test.removeNthFromEnd(root, 3);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

}
