package com.LeetCode;
import java.util.Arrays;

/**
 * Created by jianweiyuan on 16/4/6.
 */
public class Game_of_Life {
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int column=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int num=getNeighbors(board,i,j);
                if(board[i][j]>0){
                    if(num==3||num==2){
                        board[i][j]=3;
                    }
                }else{
                    if(num==3){
                        board[i][j]=2;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]==2||board[i][j]==3){
                    board[i][j]=1;
                }else{
                    board[i][j]=0;
                }
            }
        }
    }

    private int  getNeighbors(int[][] board,int x,int y){
        int neighborsNum=0;
        for(int i=x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
                if(i>=0&&i<board.length&&j>=0&&j<board[0].length){
                    neighborsNum=neighborsNum+(board[i][j]&1);
                }
            }
        }
        return neighborsNum-(board[x][y]&1);
    }

    public static void main(String[] args) {
        Game_of_Life test=new Game_of_Life();
        int[][] board={{1,0,1},{0,1,0},{0,0,1}};
        test.gameOfLife(board);
        for(int i=0;i<board.length;i++){
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
