/**
 * Created by adventure on 16/10/28.
 */
public class Path_Sum_III {
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        return resultNum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private int resultNum(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        int result=0;
        if(root.val==sum){
            result++;
        }
        result=result+resultNum(root.left,sum-root.val)+resultNum(root.right,sum-root.val);
        return  result;
    }
}
