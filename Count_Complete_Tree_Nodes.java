


public class Count_Complete_Tree_Nodes {
	public int countNodes(TreeNode root) {
		if(root==null){
			return 0;
		}
		int left_level=1;
		TreeNode node=root;
		while(node.left!=null){
			node=node.left;
			left_level++;
		}
		int right_level=1;
		node=root;
		while(node.right!=null){
			node=node.right;
			right_level++;
		}
		if(left_level==right_level){
			return (1<<left_level)-1;
		}else{
			return countNodes(root.left)+countNodes(root.right)+1;
		}
        
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Complete_Tree_Nodes test=new Count_Complete_Tree_Nodes();
		TreeNode rootNode=new TreeNode(2);
		rootNode.left=new TreeNode(1);
		rootNode.right=new TreeNode(3);
		System.out.println(test.countNodes(rootNode));
	}

}
