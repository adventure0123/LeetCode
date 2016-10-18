

import java.util.Stack;

import javax.xml.soap.Node;

public class BSTIterator {
      Stack<TreeNode> stack=new Stack<>();
	  public BSTIterator(TreeNode root) {
	        while(root!=null){
	        	stack.add(root);
	        	root=root.left;
	        }
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
			return !stack.isEmpty();
	        
	    }

	    /** @return the next smallest number */
	    public int next() {
			TreeNode node=stack.pop();
			int result=node.val;
			node=node.right;
			while(node!=null){
				stack.add(node);
				node=node.left;
			}
			return result;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node=new TreeNode(1);
		node.right=new TreeNode(2);
		BSTIterator test=new BSTIterator(node);
		System.out.println(test.next());
		System.out.println(test.next());
	}

}
