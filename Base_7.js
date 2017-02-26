/**
 * Created by adventure on 2017/2/26.
 */
/**
 * @param {number} num
 * @return {string}
 */
var convertToBase7 = function(num) {
    if(num===0){
        return "0";
    }
    var result="";
    var remainder;
    var divisor=Math.abs(num);
    while (divisor!=0){
        remainder=divisor%7;
        divisor=parseInt(divisor/7);
        result=remainder+result;
    }
    return num>0?result:"-"+result;
};

var num=-100;
console.log(convertToBase7(num));