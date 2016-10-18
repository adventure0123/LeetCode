

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/6/25.
 */
public class Reorder_List {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int count = list.size();
        ListNode start = list.get(0);
        for (int i = 1; i <= count / 2; i++) {
            //System.out.println(i);
            ListNode node = start;
            ListNode end = list.get(count - i);
            start = start.next;
            node.next = end;
            end.next = start;
        }
        start.next = null;
    }

    public static void main(String[] args) {
        Reorder_List test = new Reorder_List();
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        root.next = node1;
        test.reorderList(root);
        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }
    }
}
