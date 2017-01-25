/**
 * Created by adventure on 2017/1/25.
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    if(nums==null||nums.length==0){
        return 0;
    }
    var result=0;
    var temp=0;
    nums.forEach(function (val) {
        if(val==1){
            temp++;
        }else{
            result=temp>result?temp:result;
            temp=0;
        }
    });
    result=temp>result?temp:result;
    return result;
};

nums=[1,1,0,1,1,1,1];
console.log(findMaxConsecutiveOnes(nums));