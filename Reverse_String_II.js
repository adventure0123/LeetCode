/**
 * Created by adventure on 2017/3/14.
 */
/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function(s, k) {
    if(s.length<k){
        return s.split("").reverse().join("");
    }
    if(s.length>=k&&s.length<2*k){
        var temp1=s.substring(0,k);
        return temp1.split("").reverse().join("")+s.substring(k);
    }
    var result="";
    for(var i=0;i<s.length;i+=k){
        var tmp=s.substring(i,i+k);
        result+=tmp.split("").reverse().join("");
        i+=k;
        var end=i+k<s.length?i+k:s.length;
        result+=s.substring(i,end);
    }
    return result;
};


var s="abcdefg";
console.log(reverseStr(s,30));