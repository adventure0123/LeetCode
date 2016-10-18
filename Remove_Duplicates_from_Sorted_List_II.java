

/**
 * Created by yuanjianwei on 2015/6/1.
 */
public class Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode node = result;
        int count;
        while (head != null) {
            count = 1;
            while (head.next != null && head.val == head.next.val) {
                count++;
                head = head.next;
            }
            if (count == 1) {
                node.next = head;
                node = head;
            } else {
                node.next = head.next;
            }
            head = head.next;
        }
        return result.next;
    }
}
