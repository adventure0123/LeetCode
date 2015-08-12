package com.LeetCode;

public class Convert_Sorted_List_to_Binary_Search_Tree {
	TreeNode root=null; 
	public TreeNode sortedListToBST(ListNode head) {
		 bulidTree(head);
	     return root;   
	    }
	 
	 private  void bulidTree( ListNode head){
		 if(head==null){
			 return;
		 }
		 ListNode p1=head;
		 ListNode p2=head;
		 ListNode pre=null;
		 while(p2.next!=null&&p2.next.next!=null){
			 pre=p1;
			 p1=p1.next;
			 p2=p2.next.next;
		 }
		 //System.out.println(p1.val);
		 root=findNode(p1.val, root);
		 if(pre!=null){
			 pre.next=null;
			 bulidTree(head);
		 }
		 bulidTree(p1.next);
	 }
	 private TreeNode findNode(int val,TreeNode root){
		 if(root == null)
	            return new TreeNode(val);
	        if(val < root.val)
	            root.left = findNode(val, root.left);
	        else
	            root.right = findNode(val, root.right);
	        return root;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert_Sorted_List_to_Binary_Search_Tree test=new Convert_Sorted_List_to_Binary_Search_Tree();
		ListNode head=new ListNode(-1);
		ListNode head2=new ListNode(0);
		ListNode head3=new ListNode(1);
		ListNode head4=new ListNode(2);
		ListNode head5=new ListNode(9);
		head.next=head2;
		head2.next=head3;
		head3.next=head4;
		//head4.next=head5;
		TreeNode root=test.sortedListToBST(head);
		System.out.println(root.val);
		
	}

}
