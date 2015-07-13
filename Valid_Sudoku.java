package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Valid_Sudoku {
	public boolean isValidSudoku(char[][] board) {
		int row=board.length;
		int colum=board[0].length;
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<row;i++){
			set.clear();
			for(int j=0;j<row;j++){
				if(board[i][j]=='.'){
					continue;
				}
				if(set.contains(board[i][j])){
					return false;
				}else{
					set.add(board[i][j]);
				}
			}
		}
		for(int j=0;j<colum;j++){
			set.clear();
			for(int i=0;i<row;i++){
				if(board[i][j]=='.'){
					continue;
				}
				if(set.contains(board[i][j])){
					return false;
				}else{
					set.add(board[i][j]);
				}
			}
		}
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				set.clear();
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						if(board[3*a+i][3*b+j]=='.'){
							continue;
						}
						if(set.contains(board[3*a+i][3*b+j])){
							return false;
						}else{
							set.add(board[3*a+i][3*b+j]);
						}
					}
				}
			}
		}
		
		return true;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
