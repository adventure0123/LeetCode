/**
 * Created by adventure on 2017/2/3.
 */
/**
 * @param {string} s
 * @return {string}
 */
var frequencySort = function(s) {
    if(s==null||s.length<=1){
        return s;
    }
    var length=s.length;
    var charMap={};
    for(var i=0;i<length;i++){
        if(charMap[s.charAt(i)]==null){
            charMap[s.charAt(i)]=1;
        }else{
            charMap[s.charAt(i)]=charMap[s.charAt(i)]+1;
        }
    }
    var sortArray=[];
    for(var key in charMap){
        var item={
            "key":key,
            "num":charMap[key]
        }
        sortArray.push(item);
    }
    sortArray.sort(function (a,b) {
        return b.num-a.num;
    });
    var result="";
    for(i=0;i<sortArray.length;i++){
        for(var j=0;j<(sortArray[i]).num;j++){
            result+=sortArray[i].key;
        }

    }
    return result;
};

var s="tree";
console.log(frequencySort(s));