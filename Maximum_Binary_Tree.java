/**
 * Created by adventure on 2017/8/12.
 */
public class Maximum_Binary_Tree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        int index=0;
        int maxNum=Integer.MIN_VALUE;
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]>maxNum){
                maxNum=nums[i];
                index=i;
            }
        }
        TreeNode result=new TreeNode(maxNum);
        bulidTrees(result,nums,0,index,0);
        bulidTrees(result,nums,index+1,length,1);
        return result;
    }

    private void bulidTrees(TreeNode root,int[] nums,int start,int end,int direction){
        if(start>=end){
            return;
        }
        int index=0;
        int maxNum=Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(nums[i]>maxNum){
                maxNum=nums[i];
                index=i;
            }
        }
        TreeNode node=new TreeNode(maxNum);
        if(direction==0){//0表示左子树,1表示右子树
            root.left=node;

        }
        if(direction==1){//0表示左子树,1表示右子树
            root.right=node;
        }
        bulidTrees(node,nums,start,index,0);
        bulidTrees(node,nums,index+1,end,1);
    }
}
