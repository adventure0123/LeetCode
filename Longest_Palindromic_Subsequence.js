/**
 * Created by adventure on 2017/2/12.
 */
/**
 * @param {string} s
 * @return {number}
 */
var longestPalindromeSubseq = function(s) {
    if(!s){
        return 0;
    }
    var length=s.length;
    var array=[];
    var l=s.split('').reverse().join('');
    var temp=[];
    for(var i=0;i<=length;i++){
        temp.push(0);
    }
    array.push(temp);
    for(i=0;i<length;i++){
        temp=[0];
        array.push(temp);
        for(var j=0;j<length;j++){
            if(l.charAt(j)==s.charAt(i)){
                temp.push(array[i][j]+1);
            }else {
                temp.push(Math.max(array[i][j+1],array[i+1][j]));
            }
        }
    }
    return array[length][length];
};

var s="cbbd";
console.log(longestPalindromeSubseq(s));