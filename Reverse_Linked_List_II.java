

import java.util.List;

/**
 * Created by yuanjianwei on 2015/6/5.
 */
public class Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m == n) {
            return head;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode result = node;
        for (int i = 1; i < m; i++) {
            node = node.next;
        }
        ListNode node_start = node.next;
        ListNode temp = node.next.next;
        ListNode p = temp.next;
        for (int i = m; i < n; i++) {
            temp.next = node.next;
            node.next = temp;
            temp = p;
            if (p != null) {
                p = p.next;
            }
        }
        node_start.next = temp;
        return result.next;
    }

    public static void main(String[] args) {
        Reverse_Linked_List_II test = new Reverse_Linked_List_II();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        ListNode result = test.reverseBetween(root, 1, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
