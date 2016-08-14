import java.util.Random;

/**
 * Created by adventure on 16/8/14.
 */

public class Linked_List_Random_Node {
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    private ListNode head;
    public Linked_List_Random_Node(ListNode head) {
       this.head=head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode node=head;
        int result=0;
        int index=1;
        while(node!=null){
            Random random=new Random();
            if(random.nextInt(index)+1<=1){
                result=node.val;
            }
            index++;
            node=node.next;
        }
            return result;
    }

    class ListNode {
             int val;
             ListNode next;
            ListNode(int x) { val = x; }
         }
}
