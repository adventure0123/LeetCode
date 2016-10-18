

public class Delete_Node_in_a_Linked_List {
	public void deleteNode(ListNode node) {
        if(node==null){
        	return;
        }else if(node.next==null){
        	node=null;
        }else {
        	node.val=node.next.val;
        	node.next=node.next.next;
        }
    }

}
