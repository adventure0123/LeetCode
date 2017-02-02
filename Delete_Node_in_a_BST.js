/**
 * Created by adventure on 2017/2/2.
 */
/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
 function TreeNode(val) {
     this.val = val;
     this.left = this.right = null;
 }

/**
 * @param {TreeNode} root
 * @param {number} key
 * @return {TreeNode}
 */
var deleteNode = function(root, key) {
    if(key===null||root===null){
        return root;
    }
    if(root.val==key){
        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }else{
            var leftNode=root.left;
            if(leftNode.right!=null&&root.right!=null){
                var right=root.right;
                while(right.left!=null){
                    right=right.left;
                }
                right.left=leftNode.right;
            }
            if(root.right!=null){
                leftNode.right=root.right;
            }
            return leftNode;

        }
    }
    var pre=null;
    var node=root;
    while(node!=null){
        if(key==node.val){
            if(node.left!==null){
                var leftNode=node.left;
                if(pre.left==node){
                    pre.left=leftNode;
                }else{
                    pre.right=leftNode;
                }
                if(leftNode.right!=null&&node.right!=null){
                    var right=node.right;
                    while(right.left!=null){
                        right=right.left;
                    }
                    right.left=leftNode.right;
                }
                if(node.right!=null){
                    leftNode.right=node.right;
                }
            }else{
                if(pre.left==node){
                    pre.left=node.right;
                }else{
                    pre.right=node.right;
                }
            }
            break;
        }else if(key>node.val){
            pre=node;
            node=node.right;
        }else{
            pre=node;
            node=node.left;
        }

    }
    return root;
};

var node=new TreeNode(5);
var node1=new TreeNode(3);
var node2=new TreeNode(6);
node.left=node1;
node.right=node2;
var root=deleteNode(node,3);
console.log(root.val);
console.log(root.left);
console.log(root.right);
