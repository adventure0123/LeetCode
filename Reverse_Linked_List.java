

import java.util.List;

/**
 * Created by yuanjianwei on 2015/7/1.
 */
public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return  null;
        }
        ListNode node=head.next;
        head.next=null;
        ListNode next;
        while(node!=null){
            next=node.next;
            node.next=head;
            head=node;
            node=next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        Reverse_Linked_List test=new Reverse_Linked_List();
        ListNode result=test.reverseList(root);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
