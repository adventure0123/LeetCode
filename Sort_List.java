

public class Sort_List {
	 public ListNode sortList(ListNode head) {
		 if(head==null||head.next==null){
			 return head;
		 }
		return sort(head);
	        
	    }
	 
	 private  ListNode sort(ListNode head){
		 if(head.next==null){
			 return head;
		 }
		 ListNode p1=head;
		 ListNode p2=head;
		 while(p2.next!=null&&p2.next.next!=null){
			 p1=p1.next;
			 p2=p2.next.next;
		 }
		 p2=p1.next;
		 p1.next=null;
		 ListNode m=sort(head);
		 ListNode n=sort(p2);
		 return merge(m,n);
	 }
	 
	 private ListNode merge(ListNode m,ListNode n){
		 ListNode result=new ListNode(-1);
		 ListNode node=result;
		 while(m!=null&&n!=null){
			 if(m.val<n.val){
				 node.next=m;
				 m=m.next;
			 }else{
				 node.next=n;
				 n=n.next;
			 }
			 node=node.next;
		 }
		 if(m!=null){
			 node.next=m;
		 }
		 if(n!=null){
			 node.next=n;
		 }
		 return result.next;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_List testList=new Sort_List();
		ListNode root=new ListNode(5);
		ListNode node1=new ListNode(2);
		//node1.next=new ListNode(2);
		root.next=node1;
		root=testList.sortList(root);
		while(root!=null){
			System.out.println(root.val);
			root=root.next;
		}
	}

}
