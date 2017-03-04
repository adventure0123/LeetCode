/**
 * Created by adventure on 2017/3/5.
 */

/**
 * Definition for a binary tree node.
 * */
  function TreeNode(val) {
      this.val = val;
      this.left = this.right = null;
  }

/**
 * @param {TreeNode} root
 * @return {number}
 */


var getMinimumDifference = function(root) {
    var nums=[];
    midOrder(root,nums);
    var differ=Number.MAX_VALUE;
    for(var i=1;i<nums.length;i++){
        if(nums[i]-nums[i-1]<differ){
            differ=nums[i]-nums[i-1];
        }
    }
    return differ;
};

function midOrder(root,nums){
    if(root.left!==null){
        midOrder(root.left,nums);
    }
    nums.push(root.val);
    if(root.right!==null){
        midOrder(root.right,nums);
    }
}

var root=new TreeNode(1);
var left=new TreeNode(3);
var right=new TreeNode(5);
right.left=left;
root.right=right;
console.log(getMinimumDifference(root));