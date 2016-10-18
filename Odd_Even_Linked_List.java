

import java.util.List;

public class Odd_Even_Linked_List {
	public ListNode oddEvenList(ListNode head) {
		if(head==null||head.next==null||head.next.next==null){
			return head;
		}
		ListNode resultListNode=head;
		ListNode end=head;
		int num=1;
		while(end.next!=null){
			end=end.next;
			num++;
		}
		ListNode start=head;
		if(num%2==1){
			ListNode node=end;
			while(start!=end){
				node.next=start.next;
				node=node.next;
				start.next=node.next;
				node.next=null;
				start=start.next;
			}
		}else{
			ListNode node=end;
			while(start.next!=end){
				node.next=start.next;
				node=node.next;
				start.next=node.next;
				node.next=null;
				start=start.next;
			}
			node.next=start.next;
			start.next=start.next.next;
			node.next.next=null;
			
		}
		
		return resultListNode;
	        
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd_Even_Linked_List test=new Odd_Even_Linked_List();
		ListNode head=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		head.next=node2;
	    node2.next=node3;
	    node3.next=node4;
	    test.oddEvenList(head);
	    while(head!=null){
	    	System.out.println(head.val);
	    	head=head.next;
	    }
	}

}
