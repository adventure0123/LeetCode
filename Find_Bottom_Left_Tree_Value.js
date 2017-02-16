/**
 * Created by adventure on 2017/2/16.
 */
/**
 * Definition for a binary tree node.
 * **/
  function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {number}
 */
var findBottomLeftValue = function(root) {
    if(root==null){
        return root;
    }
    var layer=[];
    var layer2=[];
    layer.push(root);
    while(true){
        layer.forEach(function (val) {
            if(val.left!=null){
                layer2.push(val.left);
            }
            if(val.right!=null){
                layer2.push(val.right);
            }
        });
        if(layer2.length==0){
            return layer[0].val;
        }else{
            layer=layer2;
            layer2=[];
        }
    }
};

var root=new TreeNode(2);
var left=new TreeNode(5);
var right=new TreeNode(3);
root.left=left;
root.right=right;
console.log(findBottomLeftValue(root));
