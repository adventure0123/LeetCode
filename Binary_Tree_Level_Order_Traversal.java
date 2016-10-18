

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yuanjianwei on 2015/6/12.
 */
public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> out = new LinkedList<>();
        out.add(root);
        while (true) {
            List<Integer> temp = new ArrayList<>();
            Queue<TreeNode> in = new LinkedList<>();
            int size = out.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = out.poll();
                temp.add(node.val);
                if (node.left != null) {
                    in.add(node.left);
                }
                if (node.right != null) {
                    in.add(node.right);
                }
            }
            result.add(temp);
            out = in;
            if (out.isEmpty()) {
                return result;
            }
        }

    }
}
