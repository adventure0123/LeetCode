/**
 * Created by adventure on 2017/2/25.
 */
/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    if(word.length==1){
        return true;
    }
    var result=word.charAt(0)>='a'?1:-1;
    for(var i=1;i<word.length;i++){
        if(word.charAt(i)>='a'){
            if(result!=1){
                if(i==1){
                    result=1;
                }else{
                    return false;
                }
            }

        }else{
            if(result!=-1){
                return false;
            }
        }
    }
    return true;
};

var word="NIy";
console.log(detectCapitalUse(word));
