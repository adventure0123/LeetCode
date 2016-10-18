

import java.util.Comparator;
import java.util.PriorityQueue;

//PriorityQueue min-heap
public class Merge_k_Sorted_Lists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,
				new Comparator<ListNode>() {
					@Override
					public int compare(ListNode o1, ListNode o2) {
						// TODO Auto-generated method stub
						return o1.val - o2.val;
					}
				});
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				queue.add(lists[i]);
			}
		}
		ListNode result = new ListNode(-1);
		ListNode node = result;
		while (!queue.isEmpty()) {
			node.next = queue.poll();
			node = node.next;
			if (node.next != null) {
				queue.add(node.next);
			}
		}
		return result.next;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
