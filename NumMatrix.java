

import java.util.Arrays;

public class NumMatrix {
	int[][] matrix;
	int [][] sum;
	public NumMatrix(int[][] matrix) {
		if(matrix==null||matrix.length==0){
			return;
		}
        this.matrix=matrix;
        int row=matrix.length;
        int column=matrix[0].length;
        sum=new int[row+1][column+1];
        for (int i = 0; i < row; i++) {
			for(int j=0;j<column;j++){
				sum[i+1][j+1]=sum[i][j+1]+sum[i+1][j]+matrix[i][j]-sum[i][j];
			}
			
		}
        
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
    	
		if(row1==row2&&col1==col2){
			return this.matrix[row1][col1];
		}else {
			return this.sum[row2+1][col2+1]-this.sum[row1][col2+1]
					-this.sum[row2+1][col1]+this.sum[row1][col1];
		}
    	
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={
				{-1}
		};
		NumMatrix test=new NumMatrix(matrix);
		System.out.println(test.sumRegion(0, 0, 0, 0));
	}

}
