

import java.util.List;

/**
 * Created by yuanjianwei on 2015/6/1.
 */
public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode result = head;
        ListNode node = head.next;
        while (node != null) {
            while (node != null && node.val == head.val) {
                node = node.next;
            }
            head.next = node;
            head = node;
            if (node != null) {
                node = node.next;
            }
        }

        return result;
    }
}
