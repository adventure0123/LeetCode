

/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }
        ListNode pre = head;
        int length = 1;
        while (pre.next != null) {
            pre = pre.next;
            length++;
        }
        int index = length - k % length;
        if (index == 0) {
            return head;
        }
        pre.next = head;
        for (int i = 1; i < index; i++) {
            head = head.next;
        }
        ListNode result = head.next;
        head.next = null;
        return result;

    }
}
