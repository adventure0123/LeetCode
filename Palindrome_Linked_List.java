package com.LeetCode;

import freemarker.template.TemplateModel;

import java.util.List;

/**
 * Created by yuanjianwei on 2015/7/10.
 */
public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode node=head;
        int count=0;
        while(node!=null){
            node=node.next;
            count++;
        }
        int mid=count/2;
        node=head;
        ListNode root=new ListNode(-1);
        root.next=head;
        ListNode temp=head.next;
        ListNode next;
        for(int i=2;i<=mid;i++){//Reversed the 1/2 linked list
            next=node.next;
            temp=next.next;
            next.next=root.next;
            root.next=next;
            node.next=temp;
        }
        if(count%2!=0){
            temp=temp.next;
        }
        node=root.next;
        while(temp!=null){
            if(node.val!=temp.val){
                return false;
            }
            node=node.next;
            temp=temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_Linked_List test=new Palindrome_Linked_List();
        ListNode root=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(1);
        root.next=node1;
        node1.next=node2;
        node2.next=node3;
        System.out.println(test.isPalindrome(root));
    }
}
