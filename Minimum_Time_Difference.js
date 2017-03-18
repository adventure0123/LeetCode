/**
 * Created by adventure on 2017/3/18.
 */

/**
 * @param {string[]} timePoints
 * @return {number}
 */
var findMinDifference = function(timePoints) {
    var timeArray=[];
    for(var index in timePoints){
        var time=timePoints[index];
        if(time==="00:00"){
            timeArray.push(24*60);
            continue;
        }
        var temp=time.split(":");
        var hour=temp[0];
        var minutes=temp[1];
        var minutesCount=0;
        minutesCount=Number(minutes)+Number(hour[0])*10*60+Number(hour[1])*60;
        timeArray.push(minutesCount);
    }
    console.log(timeArray)
    timeArray.sort(function (a,b) {
        return a-b;
    });
    var result=Number.MAX_VALUE;
    for(var i=1;i<timeArray.length;i++){
        var diff=timeArray[i]-timeArray[i-1];
        if(diff===0){
            return 0;
        }
        result=diff<result?diff:result;
    }
    if(timeArray[0]<12*60&&timeArray[timeArray.length-1]>12*60){
        var diff=timeArray[0]+24*60-timeArray[timeArray.length-1];
        result=diff<result?diff:result;
    }
    return result;
};

var times=["05:31","22:08","00:35"];
console.log(findMinDifference(times))
