import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by adventure on 16/4/29.
 */
public class Count_of_Smaller_Numbers_After_Self {

    public List<Integer> countSmaller(int[] nums) {
        if(nums==null||nums.length==0){
            return new ArrayList<>();
        }
        List<Integer> result=new ArrayList<>();
        Tree root=new Tree(nums[nums.length-1]);
        root.leftNum=1;
        result.add(0);
        int length=nums.length;
        for(int i=length-2;i>=0;i--){
            result.add(0,buildTree(root,nums[i]));
        }
        return result;
    }

    private int buildTree(Tree root,int val){
        //System.out.println(val);
        Tree node=root;
        Tree newNode=new Tree(val);
        newNode.leftNum=1;
        //newNode.leftNum=node.leftNum;
        int leftNum=0;
        while(node!=null){
            if(val>node.value){
                leftNum+=node.leftNum;
                if(node.right==null){
                    //newNode.leftNum=node.leftNum+1;
                    node.right=newNode;

                    break;
                }else{
                    node=node.right;
                    //System.out.println(node.leftNum);
                    //newNode.leftNum=node.leftNum;

                }
            }else if (val<node.value){
                node.leftNum++;
                if(node.left==null){
                    node.left=newNode;
                    break;
                }else {
                    node=node.left;
                }
            }else{
                node.leftNum++;
                if(node.left==null){
                    node.left=newNode;
                    break;
                }else {
                    node=node.left;
                }
            }
        }
        return leftNum;
    }
    class  Tree{
        public Tree left=null;
        public Tree right=null;
        int value=0;
        int leftNum=0;//number of less than the value,include himself
        public  Tree(int value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Count_of_Smaller_Numbers_After_Self test=new Count_of_Smaller_Numbers_After_Self();
        int[] nums={2,0,1};
        System.out.println(Arrays.asList(test.countSmaller(nums)));
    }


}
