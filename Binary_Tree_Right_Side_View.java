

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by yuanjianwei on 2015/6/30.
 */
public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue1.add(root);
        result.add(root.val);
        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            if (node.right != null) {
                queue2.add(node.right);
            }
            if (node.left != null) {
                queue2.add(node.left);
            }
            if (queue1.isEmpty() && !queue2.isEmpty()) {
                result.add(queue2.peek().val);
                Queue<TreeNode> temp = queue1;
                queue1 = queue2;
                queue2 = temp;

            }
        }
        return result;
    }
}
