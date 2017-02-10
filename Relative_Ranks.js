/**
 * Created by adventure on 2017/2/10.
 */

/**
 * @param {number[]} nums
 * @return {string[]}
 */
var findRelativeRanks = function(nums) {
    var temp=[];
    nums.forEach(function (val,index){
        temp.push({"val":val,"index":index});
    });
    temp.sort(function (a,b) {
        return b.val-a.val;
    });
    var result=[];
    var index=0;
    temp.forEach(function (val) {
        if(index==0){
            result[val.index]="Gold Medal";
        }else if(index==1){
            result[val.index]="Silver Medal";
        }else if(index==2){
            result[val.index]="Bronze Medal";
        }else {
            result[val.index]=String(index+1);
        }
        index++;
    });
    return result
};

var nums=[10,3,8,9,4]
console.log(findRelativeRanks(nums));


