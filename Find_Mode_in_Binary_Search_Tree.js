/**
 * Created by adventure on 2017/2/6.
 */
/**
 * Definition for a binary tree node.
 **/
  function TreeNode(val) {
      this.val = val;
      this.left = this.right = null;
  }

/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var findMode = function(root) {
    if(root==null){
        return [];
    }
    var max=0;
    var temp=0;
    var result=[];
    var last=null;
    visit(root);
    function visit(root){
        if(root.left!=null){
            visit(root.left);
        }
        if(last==root.val){
            temp++;
            if(temp==max){
                result.push(root.val);
            }else if(temp>max){
                result=[];
                result.push(root.val);
                max=temp;
            }
        }else{
            temp=1;
            last=root.val;
            if(temp>=max){
                result.push(root.val);
                max=temp;
            }
        }
        if(root.right!=null){
            visit(root.right);
        }

    }
    return result;
};

var root=new TreeNode(1);
var left=new TreeNode(2);
var node=new TreeNode(3);
left.left=node;
root.left=left;
console.log(root);
console.log(findMode(root))
