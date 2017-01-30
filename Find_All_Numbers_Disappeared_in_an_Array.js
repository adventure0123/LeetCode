/**
 * Created by adventure on 2017/1/29.
 */

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    if(nums==null||nums.length==0){
        return [];
    }
    for(var i=0;i<nums.length;i++){
        if(nums[i]!=i+1){
            var j=i;
            var temp=nums[nums[j]-1];
            while(temp!=nums[j]){
                nums[nums[j]-1]=nums[j];
                nums[j]=temp;
                temp=nums[nums[j]-1];
            }

        }
        //console.log(nums);
    }
    //console.log(nums);

    var result=[];
    for(var i=0;i<nums.length;i++){
        if(nums[i]!=i+1){
            result.push(i+1);
        }
    }
    return result;
};

var nums=[4,3,2,7,8,2,3,1];
console.log(findDisappearedNumbers(nums));
