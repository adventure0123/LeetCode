/**
 * Created by adventure on 2017/2/23.
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {

    if(!nums||nums.length<=1){
        return 0;
    }
    var result=0;
    for(var i=0;i<nums.length;i++){
        nums[i]=nums[i]==0?-1:1;
    }
    var sum=0;
    var sumMap={};
    sumMap[0]=-1;
    for(var i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sumMap[sum]!=null){
            result=Math.max(result,i-sumMap[sum]);
        }else{
            sumMap[sum]=i;
        }
    }
    return result;
};


var nums=[1,0,1,0,1];
console.log(findMaxLength(nums));