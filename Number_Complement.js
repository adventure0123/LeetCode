/**
 * Created by adventure on 2017/1/24.
 */
/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    if(num==0){
        return 1;
    }
    if(num==1){
        return 0;
    }
    var result=0;
    var temp=0.5;
    while(num!=0){
        var bit=num&0x1;
        temp=temp*2;
        if(bit==0){
            result=result+temp;
        }

        num=num>>1;
    }
    return result;
};

var num=7;
var s=findComplement(num);
console.log(s);
