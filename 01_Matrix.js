/**
 * Created by adventure on 2017/3/26.
 */

/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var updateMatrix = function(matrix) {
    var row=matrix.length;
    var column=matrix[0].length;
    var result=new Array(row);
    for(var i=0;i<row;i++){
        var tempArray=new Array(column);
        result[i]=tempArray;
    }
    for(var i=0;i<row;i++){
        for(var j=0;j<column;j++){
            var minDistance=matrix[i][j]==0?0:Number.MAX_VALUE;
            if(j-1>=0){
                minDistance=getNearestDistance(i,j-1,minDistance,result);
            }
            if(i-1>=0){
                minDistance=getNearestDistance(i-1,j,minDistance,result);
            }
            result[i][j]=minDistance;
        }
    }
    for(var i=row-1;i>=0;i--){
        for(var j=column-1;j>=0;j--){
            var minDistance=result[i][j];
            if(j+1<column){
                minDistance=getNearestDistance(i,j+1,minDistance,result);
            }
            if(i+1<row){
                minDistance=getNearestDistance(i+1,j,minDistance,result);
            }
            result[i][j]=minDistance;
        }
    }

    return result;
};

function getNearestDistance(i,j,minDistance,result){
    if(minDistance<result[i][j]){
        result[i][j]=minDistance+1;
    }
    if(minDistance>result[i][j]){
        minDistance=result[i][j]+1;
    }
    return minDistance;
}


var matrix=[[0,1,1,1,1,0]];
console.log(updateMatrix(matrix));