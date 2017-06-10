/**
 * Created by adventure on 2017/6/10.
 */
public class Construct_String_from_Binary_Tree {
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        StringBuilder result=new StringBuilder();
        preSearch(result,t);
        result.replace(0,1,"");
        result.replace(result.length()-1,result.length(),"");
        return result.toString();
    }

    private void preSearch(StringBuilder s,TreeNode t){
        s.append("(");
        s.append(t.val);
        if(t.left!=null){
            preSearch(s,t.left);
        }else{
            if(t.right==null){
                s.append(")");
                return;
            }else{
                s.append("(").append(")");
            }
        }
        if(t.right!=null){
            preSearch(s,t.right);
        }
        s.append(")");

    }

    public static void main(String[] args) {
        Construct_String_from_Binary_Tree test=new Construct_String_from_Binary_Tree();
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        root.right=left;
        System.out.println(test.tree2str(root));
    }
}
