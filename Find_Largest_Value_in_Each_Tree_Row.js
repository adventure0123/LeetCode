/**
 * Created by adventure on 2017/2/17.
 */
/**
 * Definition for a binary tree node.
 *
 **/
  function TreeNode(val) {
      this.val = val;
      this.left = this.right = null;
  }

/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var largestValues = function(root) {
    var result=[];
    if(root==null){
        return result;
    }
    var layer1=[];
    var layer2=[];
    layer1.push(root);
    var maxTemp=-Number.MAX_VALUE;
    while(true){
        layer1.forEach(function (node) {
            if(node.val>maxTemp){
                maxTemp=node.val;
            }
            if(node.left!=null){
                layer2.push(node.left);
            }
            if(node.right!=null){
                layer2.push(node.right);
            }
        });
        result.push(maxTemp);
        maxTemp=-Number.MAX_VALUE;
        if(layer2.length==0){
            return result;
        }else{
            layer1=layer2;
            layer2=[];
        }
    }

};

var root=new TreeNode(0);
var left=new TreeNode(-1);
root.left=left;
console.log(largestValues(root));