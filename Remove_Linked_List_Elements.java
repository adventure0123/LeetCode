package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/7/1.
 */
public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode pre=new ListNode(-1);
        pre.next=head;
        ListNode result=pre;
        while(head!=null){
            if(head.val==val){
                pre.next=head.next;
            }else{
                pre=pre.next;
            }
            head=head.next;
        }
        return result.next;
    }
}
