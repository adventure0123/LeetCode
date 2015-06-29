package com.LeetCode;


/**
 * Created by yuanjianwei on 2015/6/29.
 */
public class Dungeon_Game {
    public int calculateMinimumHP(int[][] dungeon) {
        int column=dungeon[0].length;
        int row=dungeon.length;
        int[][] A=new int[row][column];
        A[row-1][column-1]=dungeon[row-1][column-1];
        for(int i=row-2;i>=0;i--){
            A[i][column-1]=Math.min(dungeon[i][column-1],A[i+1][column-1]+dungeon[i][column-1]);
        }
        for(int i=column-2;i>=0;i--){
            A[row-1][i]=Math.min(dungeon[row-1][i],A[row-1][i+1]+dungeon[row-1][i]);
        }
        for(int i=row-2;i>=0;i--){
            for(int j=column-2;j>=0;j--){
                int temp=Math.max(A[i+1][j],A[i][j+1]);
                A[i][j]=Math.min(dungeon[i][j],dungeon[i][j]+temp);
            }
        }
        return A[0][0]>0?1:1-A[0][0];
    }

    public static void main(String[] args) {
        Dungeon_Game test=new Dungeon_Game();
        int[][] A={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(test.calculateMinimumHP(A));
    }
}
