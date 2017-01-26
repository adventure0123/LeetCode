/**
 * Created by adventure on 2017/1/26.
 */


/**
 * @param {number[][]} points
 * @return {number}
 */
var numberOfBoomerangs = function(points) {

    var map={};
    if(points===null||points.length<3){
        return 0;
    }
    var result=0;
    for(var i=0;i<points.length;i++){
        var val=points[i];
        for(var j=0;j<points.length;j++){
            var val2=points[j];
            var distance=Math.pow(val[0]-val2[0],2)+Math.pow(val[1]-val2[1],2);
            if(map[distance]!=null){
                map[distance]=map[distance]+1;
            }else{
                map[distance]=1;
            }
        }
        for(var key in map){
            result+=map[key]*(map[key]-1);
        }
        map={};
    }

    return result;
};

var points=[[0,0],[1,0],[-1,0],[0,1],[0,-1]];
console.log(numberOfBoomerangs(points))